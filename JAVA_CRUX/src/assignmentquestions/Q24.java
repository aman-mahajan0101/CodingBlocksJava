package assignmentquestions;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem,ans=0;
		int multiplier=1;//10^0
		
		while(n!=0)
		{
			rem = n % 8;
			
			ans = ans + rem*multiplier;
			
			n= n / 8;
			multiplier = multiplier * 10;
		}
		System.out.println(ans);
	}

}
