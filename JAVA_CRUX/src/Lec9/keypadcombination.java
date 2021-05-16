package Lec9;

import java.util.ArrayList;

public class keypadcombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KPC("145"));
	}

	public static String getCode(char ch) {

		if (ch == '1')

			return "abc";

		else if (ch == '2')

			return "def";

		else if (ch == '3')

			return "ghi";

		else if (ch == '4')

			return "jk";

		else if (ch == '5')

			return "lmno";

		else if (ch == '6')

			return "pqr";

		else if (ch == '7')

			return "stu";

		else if (ch == '8')

			return "vwx";

		else if (ch == '9')

			return "yz";

		else if (ch == '0')

			return "@#";

		else

			return "";

	}

	public static ArrayList<String> KPC(String str) {

		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = KPC(ros);
		ArrayList<String> mr = new ArrayList<>();
		String code = getCode(ch);

		// self work
		for (int i = 0; i < code.length(); i++) {
			for (String val : rr) {
				mr.add(code.charAt(i) + val); // no
			}

		}
		return mr;
	}

}