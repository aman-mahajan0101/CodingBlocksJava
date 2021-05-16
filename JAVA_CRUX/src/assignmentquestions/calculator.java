package assignmentquestions;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char ch = 'r';

		while (ch != 'x' && ch != 'X') {
			ch = scn.next().charAt(0);
			if (ch == '+') {
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				int sum = n1 + n2;
				System.out.println(sum);
			} else if (ch == '-') {
				int n3 = scn.nextInt();
				int n4 = scn.nextInt();
				int difference = n3 - n4;
				System.out.println(difference);
			} else if (ch == '*') {
				int n5 = scn.nextInt();
				int n6 = scn.nextInt();
				int product = n5 * n6;
				System.out.println(product);
			} else if (ch == '/') {
				int n7 = scn.nextInt();
				int n8 = scn.nextInt();
				int division = n7 / n8;
				System.out.println(division);
			} else if (ch == '%') {
				int n7 = scn.nextInt();
				int n8 = scn.nextInt();
				int division = n7 % n8;
				System.out.println(division);
			} else if (ch == 'X' || ch == 'x') {
				break;
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
}
