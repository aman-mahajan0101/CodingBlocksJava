package Lec6;

import java.util.Scanner;

public class exitpoint {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] a = takeinput();
		display(a);
		exitdisplay(a);
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
	}

	public static void exitdisplay(int[][] a) {
		

	}

}
