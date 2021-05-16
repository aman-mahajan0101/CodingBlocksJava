package Lec14;

import java.util.ArrayList;
import java.util.Scanner;

public class diffwaytoaddparenthesisQues {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();									//2*3-4*5 (INPUT)
		System.out.println(possibleparenthesis(str));
	}

	public static ArrayList<String> possibleparenthesis(String ques) {

		ArrayList<String> mr = new ArrayList<>();
		if (ques.lastIndexOf('+') == -1 && ques.lastIndexOf('-') == -1 && ques.lastIndexOf('*') == -1) {
			mr.add(ques);
			return mr;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				String p1 = ques.substring(0, i);
				String p2 = ques.substring(i + 1);

				ArrayList<String> rr1 = possibleparenthesis(p1);
				ArrayList<String> rr2 = possibleparenthesis(p2);
				for (String val1 : rr1) {
					for (String val2 : rr2) {

						if (ch == '+') {
							mr.add("(" + val1 + "+" + val2 + ")");
						} else if (ch == '-') {
							mr.add("(" + val1 + "-" + val2 + ")");
						} else if (ch == '*') {
							mr.add("(" + val1 + "*" + val2 + ")");
						}
					}
				}
			}
		}
		return mr;
	}
}
