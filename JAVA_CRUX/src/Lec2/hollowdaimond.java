package Lec2;

import java.util.Scanner;

public class hollowdaimond {

	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();

			int row = 1;

			int nst = n/2+1 ;
			int nsp = -1;

			while (row <= n) {

				// work
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*\t");
					cst = cst + 1;
				}

				int csp = 1;
				while (csp <= nsp) {
					System.out.print("\t");
					csp = csp + 1;
				}

				cst = 1;
				    if(row==1 || row== n)
	                {
	                    while(cst<nst)
	                     {
	                         System.out.print("*\t");
	                         cst++;
	                     }
	                }
	                else{
	                       while (cst <= nst) {
					          System.out.print("*\t");
					            cst = cst + 1;
				            }
	                    }
				// prep
				System.out.println();

				if (row <= n/2 ) {
					nst = nst - 1;
					nsp = nsp + 2;
				} else {
					nst = nst + 1;
					nsp = nsp - 2;
				}

				row = row + 1;
			}

	// Your Code Here
	    }
	}

