package Lec2;

import java.util.Scanner;

public class hourglass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		int nsp = 0;
		int val = n+1;

		while (row <= 2 * n + 1) {
			val--;
			// for spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}

			// for stars
			int cst = 1;
			while (cst <= 2 * nst + 1) {
				if (cst <= nst ) {
					System.out.print(val+"\t");
					val--;
				} else {
					System.out.print(val+"\t");
					val++;
				}

				cst++;
			}
			
			// prep
			System.out.println();
			if (row <= n) {
				nst--;
				nsp++;
				val--;
			} else {
				nst++;
				nsp--;
				val++;
			}
			row++;

		}


	}

}
