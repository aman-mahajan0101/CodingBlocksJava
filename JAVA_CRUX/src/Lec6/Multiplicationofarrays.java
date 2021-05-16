package Lec6;

import java.util.Scanner;

public class Multiplicationofarrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] a = takeinput();
		int[][] b = takeinput();

		display(a);
		display(b);
		display(multiplication(a, b));

	}

	public static int[][] takeinput() {
		System.out.println("Size of row and column?");
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] = scn.nextInt();
			}

		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int[] val : arr) {
			for (int val1 : val) {
				System.out.print(val1 + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] multiplication(int[][] a, int[][] b) {
		int m = a.length;
		int n = b.length;
		int p = a[0].length;
		int q = b[0].length;

		int[][] c = new int[m][q];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				c[i][j] = 0;
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

}
