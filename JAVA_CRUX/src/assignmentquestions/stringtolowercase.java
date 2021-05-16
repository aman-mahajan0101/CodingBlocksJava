package assignmentquestions;

import java.util.Scanner;

public class stringtolowercase {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		StringBuilder sb = new StringBuilder(s);
		// change(sb);
		System.out.println(change(sb));
	}

	public static String change(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (check(s) == -1) {

				s = (char) (s + 32);

				str.setCharAt(i, s);
//			} else if (check(s) == 1) {
//				
//				str.setCharAt(i, s);
			} else {
				s = (char) (s - 32);
				str.setCharAt(i, s);
			}

		}

		return str.toString();

	}

	public static int check(char ch) {
		// char ch = scn.next().charAt(0);
		int a;

		a = (int) ch;

		if (a >= (int) 'a' && a <= (int) 'z') {
			// System.out.println("Lowercase");
			return 1;
//		} else if (a >= (int) 'A' && a <= (int) 'Z') {
//			// System.out.println("Üppercase");
//			return -1;
//		}
		} else
			return -1;
	}
}
