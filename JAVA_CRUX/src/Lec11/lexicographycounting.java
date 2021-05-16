package Lec11;

import java.util.Scanner;

public class lexicographycounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int end = scn.nextInt();
		lexicocounting(0, end);
	}

	public static void lexicocounting(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.print(curr+" ");
		int i = 0;

		if (curr == 0)
			i = 1;
		while (i <= 9) {
			lexicocounting(curr * 10 + i, end);
			i++;
		}
	}
}