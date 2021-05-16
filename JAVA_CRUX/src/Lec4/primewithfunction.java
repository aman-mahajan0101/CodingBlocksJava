package Lec4;

import java.util.Scanner;

public class primewithfunction {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();

		printprimes(lo, hi);
	}

	public static void printprimes(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {
			boolean res = isprime(i);

			if (res) {
				System.out.println(i);
			}

		}
	}

	public static boolean isprime(int n) {
		int i, flag = 1;
		for (i = 2; i <= n / 2; i++) {
			if (n % i != 0) {
				continue;
			} else {
				flag = 0;
				
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}
}
