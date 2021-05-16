package Lec4;

import java.util.Scanner;

public class subset {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	System.out.println("Subsets are : ");
	System.out.println("1 ->  ");
	int t=n;
	int i=2;
	while(n!=0)
	{ 
		int rem = n %10;
		System.out.println(i + "->"+ rem);
		n = n/ 10;
		i++;
	}
	
}
}
