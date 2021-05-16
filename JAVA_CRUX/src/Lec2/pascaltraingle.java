package Lec2;

import java.util.Scanner;

public class pascaltraingle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0;
		int nst = 0;
		while (row < n) {

			int cst = 0;
			int c = factorial(row);
			while (cst <= nst) {

				int rem = row - cst;
				int d = factorial(cst);
				int e = factorial(rem);
				int f = (c) / ( (d) * (e) );
				System.out.print(f + "\t");
				cst++;
			}
			// prep
			System.out.println();
			row++;
			nst++;
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;

	}
}
