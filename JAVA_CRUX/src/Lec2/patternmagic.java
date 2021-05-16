package Lec2;

import java.util.Scanner;

public class patternmagic {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int val;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {
			val = row;
			// for spacee
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			// for stars
			int cst = 1;
			while (cst <= nst) {
				if (cst <= nst / 2) {
					System.out.print(val + "\t");
					val++;
				} else {
					System.out.print(val + "\t");
					val--;
				}
				cst++;
			}

			// prep

			System.out.println();
			row++;
			nst = nst + 2;
			nsp--;
		}

	}
}
