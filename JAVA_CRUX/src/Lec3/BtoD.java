package Lec3;

import java.util.Scanner;

public class BtoD {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int rem,ans=0;
	int multiplier=1;//2^0
	
	while(n!=0)
	{
		rem = n % 10;
		
		ans = ans + rem*multiplier;
		
		n= n / 10;
		multiplier = multiplier * 2;
	}
	System.out.println(ans);
}
}
