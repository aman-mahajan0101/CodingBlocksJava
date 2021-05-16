package Lec1;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, flag = 1;
		for (i = 2; i <= n / 2; i++) {
			if (n % i != 0) {
				continue;
			} else {
				flag = 0;
			}
		}
		if (flag == 1)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
}
