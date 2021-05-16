package Lec7;

import java.util.ArrayList;
import java.util.Scanner;

public class sumofarraysdigits {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();
		int[] b = takeinput();
		ArrayList<Integer> arr = new ArrayList<>();
		arr = sumofarray(a, b);
		System.out.println(arr);
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

	public static ArrayList<Integer> sumofarray(int[] a, int[] b) {
		ArrayList<Integer> arr = new ArrayList<>();

		int n = a.length - 1;
		int m = b.length - 1;
		int i = n;
		int j = m;
		int tensdigits = 0;

		while (i >= 0 || j >= 0) {

			int sum = tensdigits;
			
			if (i >= 0) {
				sum += a[i];
			}
			if (j >= 0) {
				sum += b[j];
			}

			int rem = sum % 10;
			arr.add(0, rem);
			tensdigits = sum / 10;
			i--;
			j--;
		}

		if (tensdigits > 0) {
			arr.add(0, tensdigits);
		}
		return arr;

	}

}
