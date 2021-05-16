package Lec2;

import java.util.Scanner;

public class trydf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row1 = 1;
		int nst1 = 2 *n-3;
		int val1 = n-1;
		int nsp1 = 0;
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
