package Lec4;

import java.util.Scanner;

public class printarmstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();

		printarmstrong(lo, hi);
	}

	public static boolean isarmstrong(int n) {
		int sum = 0, rem = 0;
		int cnt = nod(n);
		int t = n;
		while (n != 0) {
			rem = n % 10;
			sum = sum + (int) Math.pow(rem, cnt);
			n = n / 10;
		}
		if (sum == t)
			return true;
		else
			return false;
	}

	public static int nod(int n) {
		int cnt = 0;
		while (n != 0) {
			n = n / 10;
			cnt++;
		}
		return cnt;
	}

	public static void printarmstrong(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			boolean res = isarmstrong(i);
			if (res) {
				System.out.println(i);
			}
		}
	}
}
