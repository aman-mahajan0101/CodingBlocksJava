package Lec1;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("The number is " + n);
		if (n % 2 == 0)
			System.out.println("The  given number is even");
		else
			System.out.println("The given number is odd");
	}
}
