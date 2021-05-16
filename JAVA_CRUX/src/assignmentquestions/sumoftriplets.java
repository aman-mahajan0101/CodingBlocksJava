package assignmentquestions;

import java.util.Arrays;
import java.util.Scanner;

public class sumoftriplets {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int size = scn.nextInt();
		int[] a = takeinput(size);	
		int target = scn.nextInt();
		display(a,target);
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(a[i]);
//		}
	}

	public static int[] takeinput(int size) {
		int n = size;
		int[] arr = new int[n];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr, int tar) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int lo = i + 1;
			int hi = arr.length - 1;
			while (lo < hi) {
				if (arr[i] + arr[lo] + arr[hi] == tar) {
					System.out.println(arr[i] + ", " + arr[lo] + " and " + arr[hi]);
					lo++;
					hi--;
				} else if (arr[i] + arr[lo] + arr[hi] < tar) {
					lo++;
				}
				else {
					hi--;
				}
			}

		}
	}

}
