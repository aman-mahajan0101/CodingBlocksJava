package Lec2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp = 0;
		int nst = n;// TODO Auto-generated method stub

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
			row++;
			nst--;
			nsp = nsp + 2;

		}
	}

}
