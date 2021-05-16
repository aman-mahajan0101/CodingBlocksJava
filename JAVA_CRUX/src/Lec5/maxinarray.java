package Lec5;

import java.util.Scanner;

public class maxinarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();

		display(a);
		int s = max(a);
		System.out.println(s);
	}

	public static int[] takeinput() {
		System.out.println("Size ?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int a = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];
			}
		}
		return a;
	}
}
