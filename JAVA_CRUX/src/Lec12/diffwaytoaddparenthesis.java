package Lec12;

import java.util.ArrayList;
import java.util.Scanner;

public class diffwaytoaddparenthesis {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(possibleparenthesis(str));
	}

	public static ArrayList<Integer> possibleparenthesis(String ques) {

		ArrayList<Integer> mr = new ArrayList<>();
		if (ques.lastIndexOf('+') == -1 && ques.lastIndexOf('-') == -1 && ques.lastIndexOf('*') == -1) {
			mr.add(Integer.parseInt(ques));
			return mr;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				String p1 = ques.substring(0, i);
				String p2 = ques.substring(i + 1);

				ArrayList<Integer> rr1 = possibleparenthesis(p1);
				ArrayList<Integer> rr2 = possibleparenthesis(p2);
				for (int val1 : rr1) {
					for (int val2 : rr2) {

						if (ch == '+') {
							mr.add(val1 + val2);
						} else if (ch == '-') {
							mr.add(val1 - val2);
						} else if (ch == '*') {
							mr.add(val1 * val2);
						}
					}
				}
			}
		}
		return mr;
	}
}
