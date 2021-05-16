package Lec10;

import java.util.Scanner;

public class Printdsubsequenceswithascii {
	static int count=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printss(str, "");
		System.out.println();
		System.out.println(count);
	}

	public static void printss(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans+" ");
			count++;
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printss(roq, ans); // no
		printss(roq, ans + ch); // yes
		printss(roq,  ans +(int)ch); // ascii

	}

}
