package Lec2;

import java.util.Scanner;

public class doublearrow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp1 = n - 1;
		int val = 1;
		int nsp2 = -1;
		while (row <= n) {

			// for spaces
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print(" ");
				csp1++;
			}
			// for stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				val--;
				cst++;
			}
			// for spaces
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print(" ");
				csp2++;
			}

			// for stars
			int cst2 = 1;
			if (row == 1 || row == n) {
				val++ ;
				cst2 = 2;
			}

			val++ ;
			while (cst2 <= nst) {
				System.out.print(val);
				val++;
				cst2++;
			}
			// }

			// prep
			System.out.println();
			row++;
			if (row <= n / 2 + 1) {
				nsp2 = nsp2 + 2;
				nsp1 = nsp1 - 2;
//				val++;
				nst++;
			} else {
				nsp2 = nsp2 - 2;
				nsp1 = nsp1 + 2;
				val-=2 ;
				nst--;
			}
		}

	}
}
