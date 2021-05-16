package Lec14;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {

		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scn.nextInt();
//		}
		quicksort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi)
			return;

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		// partitioning
		int left = lo;
		int right = hi;

		while (left <= right) {

			// moving left to problem

			while (arr[left] < pivot)
				left++;
			// moving left to problem

			while (arr[right] > pivot)
				right--;

			// solving the problem
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
	}
}
