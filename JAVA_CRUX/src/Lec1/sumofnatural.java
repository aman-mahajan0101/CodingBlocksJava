package Lec1;

import java.util.Scanner;

public class sumofnatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1, sum = 0;
		while (i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("The sum of natural numbers till "+n+" is 5"+sum);
	}

}
