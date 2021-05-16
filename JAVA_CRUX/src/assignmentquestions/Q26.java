package assignmentquestions;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=0;
		int[] t = new int[n];
		while(i<n)
		{
			 t[i] = scn.nextInt();
			
			i++;
		}
		
		for(i=0;i<t.length;i++)
		{
			System.out.println(BtoD(t[i]));
		}
		
	}
public static int BtoD(int n)
{
	int rem,ans=0;
	int multiplier=1;//2^0
	
	while(n!=0)
	{
		rem = n % 10;
		
		ans = ans + rem*multiplier;
		
		n= n / 10;
		multiplier = multiplier * 2;
	}
	return ans;
}
}
