package Lec1;

import java.util.Scanner;

public class reverseofnumber {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = 1234;
	int t,rev,sum=0;
	
	while(n!=0)
	{
		rev = n %10;
		sum = sum*10 + rev;
		n = n / 10;
	}
	n = sum;
	System.out.println("The reverse of given number is "+n);
	scn.close();
}
}
