package assignmentquestions;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 0;
		int t = n;
		int sumo=0,sume=0;
		if (t == 0)
			cnt++;
		else {
			while (t != 0) {
				cnt++;
				t = t / 10;
			}
		}
		t=n;
		int i =1;
		while(i<=cnt)
		{
			int rem = t % 10;
			if(i%2==0)
			{
				sume+=rem;
			}
			else
			{
				sumo+=rem;
			}
			
			t = t / 10;
			i++;
			
		}
		System.out.println(sumo);
		System.out.println(sume);
	}
}
