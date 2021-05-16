package Lec5;

import java.util.Scanner;

public class subarraysum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();
		subarray(a);
		// display(a);
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

	public static void subarray(int[] arr) {
		int a = arr.length;
		for (int i = 0; i < a; i++) {
			for (int k = i; k < a; k++) {
				int sum = 0;

				for (int r = i; r <= k; r++) {
					sum += arr[r];
					System.out.print(arr[r] + " ");
				}
				System.out.println(" sum is " + sum);

			}
		}

	}
}
