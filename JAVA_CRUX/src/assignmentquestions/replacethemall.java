package assignmentquestions;

import java.util.Scanner;

public class replacethemall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long temp = n;
		long m = 1;
		long res = 0;

		if (n == 0) {
			n = 5;
			System.out.println(n);
		} else {
			while (temp > 0) {
				long rem = temp % 10;
				temp = temp / 10;

				if (rem == 0) {
					rem = 5;
				}
				res = res + rem * m;
				m = m * 10;
			}
			n = res;
			System.out.println(n);
		}

	}

}
