package assignmentquestions;

import java.util.Scanner;

public class painterpartition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int nop = scn.nextInt();
		int nob = scn.nextInt();

		int[] boards = new int[nob];
		for (int i = 0; i < boards.length; i++) {
			boards[i]=scn.nextInt();
		}

		int lo = boards[nob - 1];
		int hi = 0;

		for (int b : boards) {
			hi += b;
		}

		int ans = 0;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(boards, mid, nop)) {

				ans = mid;
				hi = mid - 1;
			} else {

				lo = mid + 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean isItPossible(int[] boards, int cap, int nop) {

		int painters = 1;
		int TimeConsumed = 0;

		int currBoard = 0;

		while (currBoard < boards.length) {

			if (TimeConsumed + boards[currBoard] <= cap) {
				TimeConsumed += boards[currBoard];
				currBoard++;
			} else {

				painters++;
				TimeConsumed = 0;
			}

			if (painters > nop) {
				return false;
			}
		}
		return true;
	}

}
