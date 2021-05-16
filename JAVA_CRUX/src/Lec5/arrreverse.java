package Lec5;

import java.util.Scanner;

public class arrreverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Size ?");
		int n = scn.nextInt();
		int[] a = takeinput(n);
		System.out.println("Reversed array is");
		int[] b = rotate(a,n);
		display(b);
	}

	public static int[] rotate(int[] arr, int size) {
		int[] b = new int[size];
		int j = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			b[j] = arr[i];
			j++;
		}
		return b;
	}

	public static int[] takeinput(int size) {
		// System.out.println("Size ?");
		int n = size;
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
}
