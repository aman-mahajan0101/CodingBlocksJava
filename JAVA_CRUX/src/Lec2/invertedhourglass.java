package Lec2;

import java.util.Scanner;

public class invertedhourglass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp =2*n-1;
		int nst=1;
		int val;
		while(row<=2*n+1)
		{
			val = n;
			//for stars
			 int cst = 1;
			 if(row==n+1)
			 { cst=2;
			 }
			 while(cst<=nst)
			 {
				 System.out.print(val+"\t");
				 val--;
				 cst++;
			 }
			 
			//for spaces
			 int csp=1;
			 while(csp<=nsp)
			 {
				 System.out.print("\t");
				 csp++;
			 }
			//for stars
			 cst=1;
			if(row==n+1)
			 {
			   System.out.print("0\t");
			   cst=2;
			 }
			 while(cst<=nst)
			 {
				 System.out.print(val+1+"\t");
				 val++;
				 cst++;
			 }
			
			//prep
			 System.out.println();
			 if(row<=n)
			 {
				 nst++;
				 nsp = nsp -2;
			 }
			 else
			 {
				 nst--;
				 nsp=nsp+2;
			 }
			row++;
			
			
		}
	}
}
