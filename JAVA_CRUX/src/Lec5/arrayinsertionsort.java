package Lec5;

import java.util.Scanner;

public class arrayinsertionsort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();
		insertionsort(a);
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
	public static void insertionsort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j = i-1;
			int val = a[i];
			while(j>=0 && a[j]>val)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=val;
		}
	}
}
