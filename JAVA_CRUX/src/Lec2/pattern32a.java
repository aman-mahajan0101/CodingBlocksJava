package Lec2;

import java.util.Scanner;

public class pattern32a{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// for stars
         val=row;
			int cst = 1;
			while (cst <= nst) {
				if(cst%2==0)
				  System.out.print("*");
				else 
				System.out.print(val);
				
				cst++;
			}

			// prep
			System.out.println();
			if (row <= n - 1) {
				nst=nst+2;
			} else {
				nst=nst-2;
			}

			row++;
		}

	}

}
