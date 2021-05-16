package Lec6;

import java.util.Scanner;

public class Spiraldisplay {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] a = takeinput();
		display(a);
		spiraldisplay(a);// TODO Auto-generated method stub

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

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;

		int total = arr.length * arr[0].length;
		int count = 0;

		while (count < total) {

			// first col
			for (int r = minrow; r <= maxrow && count < total; r++) {
				System.out.print(arr[r][mincol] + " ");
				count++;
			}
			mincol++;

			// last row
			for (int r = mincol; r <= maxcol && count < total; r++) {
				System.out.print(arr[maxrow][r] + " ");
				count++;
			}
			maxrow--;

			// last col
			for (int r = maxrow; r >= minrow && count < total; r--) {
				System.out.print(arr[r][maxcol] + " ");
				count++;
			}
			maxcol--;

			// first row

			for (int r = maxcol; r >= mincol && count < total; r--) {
				System.out.print(arr[minrow][r] + " ");
				count++;
			}
			minrow++;

		}
	}

}
