package assignmentquestions;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int cnt=1;
		int n=1;
		while(cnt<=n1)
		{
			int sum  = 3*n + 2;
			if(sum%n2!=0)
			{
				System.out.println(sum);
				cnt++;
			}
			n++;
		}
	}

}
