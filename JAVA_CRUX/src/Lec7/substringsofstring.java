package Lec7;

import java.util.Scanner;

public class substringsofstring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		substring(str);
	}

	public static void substring(String str) {
		int a = str.length();
		for (int i = 0; i < a; i++) {
			for (int k = i; k < a; k++) {
				for (int r = i; r <= k; r++) {
					System.out.print(str.charAt(r) + " ");
				}
				System.out.println();
			}
		}

	}
}
