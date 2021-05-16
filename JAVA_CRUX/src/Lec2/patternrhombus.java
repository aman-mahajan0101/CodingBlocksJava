package Lec2;

import java.util.Scanner;

public class patternrhombus {
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
	
		int row1 = 1;
		int nst1 = 2 *n-3;
		int val1 = n-1;
		int nsp1 = 1;
		while(row1<n)
		{
			//for spces
			 int csp =1;
			 while(csp<=nsp1)
			 {
				 System.out.print("\t");
				 csp++;
			 }
			 //for stars
			 int cst=1;
			 while(cst<=nst1)
			 {
				 if(cst<=nst1/2)
				 {
					 System.out.print(val1+"\t");
					 val1++;
				 }
				 else
				 {
					 System.out.print(val1+"\t");
					 val1--;
				 }
				 cst++;
			 
			 }
			 System.out.println();
			 row1++;
			 nst1 = nst1 - 2;
			 nsp1 ++;
		}


	}
}
