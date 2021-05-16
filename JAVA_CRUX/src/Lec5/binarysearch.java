package Lec5;

import java.util.Scanner;

public class binarysearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = takeinput();
		System.out.println("Ënter the item you ant to search");
		int item = scn.nextInt();
		System.out.println(binarys(a, item));
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

	public static int binarys(int[] arr, int item) {
		int lo, hi, mid;
		lo = 0;
		hi = arr.length - 1;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;

			if (item > arr[mid])
				lo = mid + 1;
			else if (item < arr[mid])
				hi = mid - 1;
			else
				return mid;

		}
		return -1;
	}
}
