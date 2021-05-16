package assignmentquestions;

import java.util.Scanner;

public class stringcompression{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		compress(str);
		scn.close();
	}

	public static void compress(String str) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
				else
					break;
			}
			sb.append(str.charAt(i));
			i += count - 1;
			if (count > 1)
				sb.append(count);
		}
		System.out.println(sb.toString());
	}
}
