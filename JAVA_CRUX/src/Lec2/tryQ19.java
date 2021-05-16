package Lec2;

import java.util.Scanner;

public class tryQ19 {
 public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int nsp = 2*n-3+1;
	int nst = 1;

	while (row <= n) {

		// for star
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
		 if(row==n)
			 cst=2;
		while (cst <= nst) {
			System.out.print("*");
			cst++;
		}

		// prep
		System.out.println();
		nst = nst + 1;
		nsp = nsp -2;
		row++;
	}	
}
}
