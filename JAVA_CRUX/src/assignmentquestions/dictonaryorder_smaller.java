package assignmentquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dictonaryorder_smaller {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String str1 = sort(str);
		permutation2(str1, "", str);

		// if (val.compareTo(str1)== 0 || val.compareTo(str1) == -1) {

	}

	public static String sort(String str) {

		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}

	public static void permutation2(String ques, String ans, String s) {
		if (ques.length() == 0) {
			if (ans.compareTo(s) > 0)
				System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			permutation2(roq, ans + ch, s);

		}

	}
}
