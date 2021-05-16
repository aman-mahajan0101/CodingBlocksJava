package Lec5;

import java.util.Scanner;

public class arrayrotation {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();
		rotate(a);
		display(a);
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

	public static void rotate(int[] arr) {
		int a = arr.length;
		System.out.println("Enter the rotation you want to perfrom");
		int b = scn.nextInt();

		if (b > a) {
			b = b % a;
		}
		if (b < 0) {
			b = b + a;
		}
		
		for(int r=1;r<=b;r++)
		{int temp = arr[arr.length-1];
			for(int i=arr.length-1;i>=1;i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0]=temp;
		}

	}

}
