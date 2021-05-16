package Lec5;

import java.util.Scanner;

public class reversewithouttemparr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = takeinput();
		reverse(a);

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

	public static void reverse(int arr[]) {
		int a = arr.length - 1;

		int i = 0;
		if (a % 2 == 0 || a % 2!=0) {
			while (i <= a) {
				int temp = arr[i];
				arr[i] = arr[a];
				arr[a] = temp;
				i++;
				a--;
			}
		}

		display(arr);
	}
}
