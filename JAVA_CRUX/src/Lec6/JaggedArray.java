package Lec6;

import java.util.Scanner;

public class JaggedArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] a = takeinput();
		display(a);
	}

	public static int[][] takeinput() {
		System.out.println("Row ?");
		int n = scn.nextInt();
		int[][] arr = new int[n][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("cols for " + i + " row");
			int col = scn.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter value for " + i + " -" + j);
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
