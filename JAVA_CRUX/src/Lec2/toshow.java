package Lec2;

import java.util.Scanner;

public class toshow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nsp = n / 2;
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
				if (row <= n / 2 + 1) {
					if (cst == 1 || cst == 2 * row - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				} else {
					if (cst == 1 || cst == 2 * (n - row) + 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}

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
