package Lec11;

import java.util.Scanner;

public class mazepathusingprint {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int d = scn.nextInt();
		mazepath(0, 0, c - 1, d - 1, "");
		System.out.println();
		System.out.println(count);
		// mazepath1(0, 0, 2, 2, "");
	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {

		// base case
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (cc + 1 <= ec) {
			mazepath(cr, cc + 1, er, ec, ans + "H");
		}
		if (cr + 1 <= er) {
			mazepath(cr + 1, cc, er, ec, ans + "V");
		}
	}

	public static void mazepath1(int cr, int cc, int er, int ec, String ans) {

		// base case
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		// negative base case
		if (cr > er || cc > ec) {
			return;
		}

		mazepath(cr, cc + 1, er, ec, ans + "H");

		mazepath(cr + 1, cc, er, ec, ans + "V");

	}
}
