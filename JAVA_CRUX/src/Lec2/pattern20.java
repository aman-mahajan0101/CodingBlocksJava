package Lec2;

import java.util.Scanner;

public class pattern20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nsp = n/2;
		int nst = 1;

		while (row <= n) {
			// for spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// for stars

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();

			// preperation

			if (row <= n / 2) {
				nst = nst + 2;
				nsp--;
			} else {
				nst = nst - 2;
				nsp++;
			}
			row++;
		}
	}
}
