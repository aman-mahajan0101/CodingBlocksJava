package Lec1;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int i = 1;
		int gcd = 0;
		for (i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		if(gcd!=0)
		   System.out.println("The GCD of " + n1 + " " + n2 + " is " + gcd);
		else
		   System.out.println("The given number don't have any GCD");
	}
}
//