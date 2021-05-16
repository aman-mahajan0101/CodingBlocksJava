package assignmentquestions;

import java.util.Scanner;

public class shoppinggame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc > 0) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			display(m, n);
		}
	}

	public static void display(int aayushphone, int harshitphone) {
		int cnt = 1;

		int aphone = 0;
		int hphone = 0;

		while (true) {
			aphone += cnt;
			cnt++;
			hphone += cnt;
			cnt++;

			if (aphone > aayushphone) {
				System.out.println("Harshit");
				break;
			} else if (hphone > harshitphone) {
				System.out.println("Aayush");
				break;
			}
		}

	}
}
