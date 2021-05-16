package Lec11;

import java.util.Scanner;

public class validparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		validparenthesis(c, 0, 0, "");
	}

	public static void validparenthesis(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || open > close) {
			return;
		}

		validparenthesis(n, open + 1, close, ans + ")");

		validparenthesis(n, open, close + 1, ans + "(");
	}

}
