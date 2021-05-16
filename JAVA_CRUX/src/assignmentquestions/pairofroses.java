package assignmentquestions;

import java.util.Arrays;
import java.util.Scanner;

public class pairofroses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = scn.nextInt();
		while (tc > 0) {
			int n = scn.nextInt();
			int[] a = takeinput(n);
			int money = scn.nextInt();
			display(a, money);
			System.out.println();
			tc--;
		}
	}

	public static int[] takeinput(int size) {
		int n = size;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr, int target) {
		Arrays.sort(arr);

		int first = 0;
		int second = 0;

		int lo = 0;
		int hi = arr.length - 1;

		while (lo < hi) {

			int sum = arr[lo] + arr[hi];

			if (sum < target) {
				lo++;
			} else if (sum > target) {
				hi--;
			} else {
				first = lo;
				second = hi;

				lo++;
				hi--;
			}

		}

		System.out.println("Deepak should buy roses whose prices are " + arr[first] + " and " + arr[second] + ".");

	}
}
