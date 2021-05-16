package Lec5;

import java.util.Scanner;

public class subsetarray {
Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	int[] a = {10,20,30};
	subset(a);
}
public static void subset(int arr[])
{
	
	for(int i=0;i<8;i++)
	{
		int temp = i;
		for(int j = 0 ; j < arr.length;j++)
		{
		   int rem = temp % 2;
		   if(rem==1)
			   System.out.print(arr[j] + " ");
		   temp = temp /2;
		}
		System.out.println();
	}
}
}
