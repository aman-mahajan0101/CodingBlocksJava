package Backtracking_LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 *
 */

public class _93_RestoreIPAddresses {

	public static void main(String[] args) {

		System.out.println(restoreIpAddresses("010010"));
	}

	public static List<String> restoreIpAddresses(String s) {

		List<String> main = new ArrayList<String>();

		restoreIpAddresses(s, "", main, 0);

		return main;
	}

	public static void restoreIpAddresses(String ques, String ans, List<String> main, int dots) {

		if (ques.length() == 0) {

			if (dots == 4)
				main.add(ans.substring(0, ans.length() - 1));

			return;
		}

		for (int i = 1; i <= ques.length() && i <= 3; i++) {

			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (noLeadingZeros(part) && isValidPart(part))
				restoreIpAddresses(roq, ans + part + ".", main, dots + 1);
		}
	}

	private static boolean noLeadingZeros(String str) {

		if (str.length() <= 1) {
			return true;
		}

		return str.charAt(0) != '0';

	}

	public static boolean isValidPart(String str) {

		return Integer.parseInt(str) <= 255;
	}

}