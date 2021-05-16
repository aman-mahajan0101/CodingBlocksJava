package Lec1;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, j, q = 5;
		for (i = n; i > 0; i--) {
			q = n - i;
			for (int k = 0; k < q; k++) {
				System.out.print(" ");
			}
			for (j = i * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
