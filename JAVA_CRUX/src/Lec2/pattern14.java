package Lec2;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;

			while (row <= 2 * n - 1) {

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

				// prep
				System.out.println();
				if (row <= n - 1) {
					nsp = nsp - 1;
					nst++;
				} else {
					nsp++;
					nst--;
				}
				row++;

		}

	}

}
