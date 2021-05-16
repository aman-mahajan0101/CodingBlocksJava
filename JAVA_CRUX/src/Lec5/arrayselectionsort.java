package Lec5;

import java.util.Scanner;

public class arrayselectionsort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeinput();
		selectionsort(a);
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
	public static void selectionsort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min = i;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}
