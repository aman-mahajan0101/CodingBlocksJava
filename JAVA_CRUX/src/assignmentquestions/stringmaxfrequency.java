package assignmentquestions;

import java.util.Scanner;

public class stringmaxfrequency {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(duplicate(str));
		scn.close();
	}

	public static int duplicate(String str) {
		int count = 0;
		int[] a = new int[str.length()];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
				{count++;
				    a[i]=count;}
				else
					break;
			}
			a[i]=count;
		}
//		
		return 1;
	}
}
