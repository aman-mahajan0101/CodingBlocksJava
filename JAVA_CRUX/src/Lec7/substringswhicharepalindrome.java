package Lec7;

import java.util.Scanner;

public class substringswhicharepalindrome {
Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(check(str));
	}
	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	public static int check(String str) {
//		int cnt=0;
//		int a = str.length();
//		String s = new String();
//		for (int i = 0; i < a; i++) {
//			for (int k = i; k < a; k++) {
//				//s = "";
//				for (int r = i; r <= k; r++) {
//					//System.out.print(str.charAt(r) + " ");
//					s = s.concat(str.charAt(r) + "");
//				}
//				//System.out.println(s);
//				//System.out.println();
//				if(ispalindrome(s))
//				{
//					cnt++;
//				}
//			}
//		}
//		return cnt;
		int count = 0;

		for (int si = 0; si <= str.length() - 1; si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String val = str.substring(si, ei);

				if (ispalindrome(val)) {
					count++;
				}
			}
		}

		return count;

	}
}
