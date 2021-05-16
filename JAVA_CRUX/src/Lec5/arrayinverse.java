package Lec5;

import java.util.Scanner;

public class arrayinverse {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int[] a = takeinput();

		int[] b = inverse(a);
		display(b);
		
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
	public static int[] inverse(int[] arr) {

		int[] b = new int[arr.length];
		int c=0;
		for (int i = 0; i < arr.length; i++) {
				c = arr[i]; 
				b[c]=i;
		}
		return b;
	}
}
