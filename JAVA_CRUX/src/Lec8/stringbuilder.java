package Lec8;

import java.util.Scanner;

public class stringbuilder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		StringBuilder sb = new StringBuilder(s);
		// change(sb);
		System.out.println(change(sb));
	}

	public static String change(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (i % 2 == 0) {

				s--;
				str.setCharAt(i, s);
			} else {
				s++;
				str.setCharAt(i, s);
			}
		}

		return str.toString();
	}

}
