package assignmentquestions;

import java.util.Scanner;

public class basiccalculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int[] arr = new int[100];
		int i = 0, cnt = 0;
		{
			if (ch == '+') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				cnt++;
				arr[i] = a + b;
			} else if (ch == '-') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				cnt++;
				arr[i] = a - b;
			} else if (ch == '*') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				cnt++;
				arr[i] = a * b;
			} else if (ch == '/') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				cnt++;
				arr[i] = a / b;
			} else if (ch == '%') {
				int a = scn.nextInt();
				int b = scn.nextInt();
				cnt++;
				arr[i] = a % b;

			} else if (ch != 'X' || ch != 'x') {
				if (cnt > 0) {
					for (i = 0; i < cnt; i++)
						System.out.println(arr[i]);
				}

			} else {

				System.out.println("Invalid operation. Try again.");
			}
			ch = scn.next().charAt(0);
			i++;
		}
		while (ch != 'X' || ch != 'x');
	}
}
