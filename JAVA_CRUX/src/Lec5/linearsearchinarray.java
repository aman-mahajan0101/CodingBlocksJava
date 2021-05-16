package Lec5;

import java.util.Scanner;

public class linearsearchinarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();

		display(a);
		int s = linears(a);
		System.out.println(s);
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

	public static int linears(int[] arr) {
		System.out.println("Ënter the item you want to search");
		int item = scn.nextInt();
		int a=-1;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]==item)
				a=i+1;
			
		}
		return a;
	}
}
