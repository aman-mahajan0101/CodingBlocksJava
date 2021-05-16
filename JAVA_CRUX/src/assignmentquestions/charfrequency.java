package assignmentquestions;

import java.util.Scanner;

public class charfrequency {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		freq(str);
		scn.close();

	}

	public static void freq(String str) {
		int cnt = 0, val = 0;
		int pos = -1;
		for (int i = 0; i < str.length(); i++) {
			cnt = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i))
					cnt++;
			}
			if (val < cnt) {
				val = cnt;
				pos = i;
			}
		}
		System.out.println(str.charAt(pos));
	}
}
