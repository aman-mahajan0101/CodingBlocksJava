package Lec11;

import java.util.Scanner;

public class possiblepalindromicpartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		palindromepartition(str, "");
	}

	public static void palindromepartition(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (ispalindrome(part))
				palindromepartition(roq, ans + part + " ");

		}
	}

	public static boolean ispalindrome(String str) {
		int m = str.length();
		int flag = 1;

		int j = m - 1;
		for (int i = 0; i < m / 2; i++) {

			if (str.charAt(i) != (str.charAt(j))) {
				flag = 0;
			} 
			j--;
		}

		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}
}
