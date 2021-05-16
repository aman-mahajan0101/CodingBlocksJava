package assignmentquestions;

import java.util.Scanner;

public class simpleinput {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[100];
		int sum = 0;
		int i = 0;
		int cnt = 0;
		do {
			int t = scn.nextInt();
			sum += t;
			if(sum>=0)
			{
				arr[i]=t;
				i++;
			}
		} while (sum >= 0);
		for (cnt = 0; cnt < i; cnt++) {
			System.out.println(arr[cnt]);
		}
		scn.close();
	}

}
