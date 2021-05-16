package Lec7;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(ispalindrome(str));
	}

	public static boolean ispalindrome(String str) {
		int m = str.length();
		int flag = 1;

		int j = m - 1;
		for (int i = 0; i < m / 2; i++) {

			if (str.charAt(i) == (str.charAt(j))) {
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
