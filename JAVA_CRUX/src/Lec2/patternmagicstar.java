package Lec2;

import java.util.Scanner;

public class patternmagicstar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		int nsp = -1;

		while (row <= 2 * n - 1) {
			// for stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// for spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// for stars
			cst = 1;
			if (row == 1 || row == 2 * n - 1)
				cst = 2;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();
			if (row < n) {
				nst--;
				nsp = nsp + 2;
			} else {
				nst++;
				nsp = nsp - 2;
			}
			row++;
		}
	}

}
