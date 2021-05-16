package Lec5;

import java.util.Scanner;

public class subarraysumusing2loops {
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
			int sum =0;
			for (int k = i; k < a; k++) {
				sum += arr[k];
				System.out.println(sum);
			}
			System.out.println("__");
		}

	}
}
