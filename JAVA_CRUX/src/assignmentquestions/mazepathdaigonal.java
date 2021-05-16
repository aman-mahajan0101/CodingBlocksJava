package assignmentquestions;

import java.util.Scanner;

public class mazepathdaigonal {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int d = scn.nextInt();
		// mazepath(0, 0, c - 1, d - 1, "");
		// System.out.println();
		mazepath1(0, 0, c - 1, d - 1, "");
		System.out.println();
		System.out.println(cnt);
	}
//
//	//public static void mazepath(int cr, int cc, int er, int ec, String ans) {
//
//		// base case
//		if (cr == er && cc == ec) {
//			System.out.print(ans + " ");
//
//			return;
//		}
//		// negative base case
//		if (cr > er || cc > ec) {
//			return;
//		}
//
//		mazepath1(cr, cc + 1, er, ec, ans + "V");
//
//		mazepath1(cr + 1, cc, er, ec, ans + "H");
//		mazepath1(cr + 1, cc + 1, er, ec, ans + "D");
//		return;
//
//	}

	public static void mazepath1(int cr, int cc, int er, int ec, String ans) {

		// base case
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			cnt++;
			return;
		}
		// negative base case
		if (cr > er || cc > ec) {
			return;
		}
		// cnt = 0;
		mazepath1(cr, cc + 1, er, ec, ans + "V");
		mazepath1(cr + 1, cc, er, ec, ans + "H");
		mazepath1(cr + 1, cc + 1, er, ec, ans + "D");

		// System.out.println(cnt);
		return;
	}
}
