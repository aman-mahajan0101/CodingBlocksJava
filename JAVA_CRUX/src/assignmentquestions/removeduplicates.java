package assignmentquestions;

import java.util.ArrayList;
import java.util.Scanner;

public class removeduplicates {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		duplicates(str);
		scn.close();
	}

	public static void duplicates(String str) {
		char ch, ch1;
		int cnt = 0, j = 0;
		String str1 = "";
		for (int i = 0; i < str.length();) {
			cnt = 0;
			for (j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					cnt++;
				else
					break;

			}
			if (cnt > 1) {
				str1 = str1 + str.charAt(i);
				i = i + cnt;
			} else {
				str1 = str1 + str.charAt(i);
				i++;
			}
		}
		System.out.println(str1);
	}
}
