package Lec1;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a, b, nexterm;
		a = 0;
		b = 1;
		int i = 2;
		System.out.print("The fibonacci series is " + a + " " + b);
		while (i < n + 1) {
			nexterm = a + b;
			a = b;
			b = nexterm;
			System.out.print(" " + nexterm);
			i = i + 1;
		}
	}
}
