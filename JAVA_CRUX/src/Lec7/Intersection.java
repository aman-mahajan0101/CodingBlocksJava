package Lec7;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] a = takeinput();
		int[] b = takeinput();
		ArrayList<Integer> arr = new ArrayList<>();
		arr = intersection(a, b);
		display(a);
		display(b);
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

	public static ArrayList<Integer> intersection(int[] c, int[] d) {
		ArrayList<Integer> arr = new ArrayList<>();

		int n = c.length;
		int m = d.length;

		int i = 0;
		int j = 0;
		while (i < n && j < m) {

			if (c[i] < d[j]) {
				i++;
			} else if (c[i] > d[j]) {
				j++;
			} else {
				arr.add(c[i]);
				i++;
				j++;
			}

		}

		return arr;

	}
}
