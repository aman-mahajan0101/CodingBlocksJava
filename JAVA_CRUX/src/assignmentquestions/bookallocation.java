package assignmentquestions;

import java.util.Scanner;

public class bookallocation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int nob = scn.nextInt();
			int nos = scn.nextInt();
			int[] books = new int[nob];
			for (int i = 0; i < books.length; i++) {
				books[i] = scn.nextInt();
			}

			int lo = books[nob - 1];
			int hi = 0;

			for (int b : books) {
				hi += b;
			}

			int ans = 0;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(books, mid, nos)) {

					ans = mid;
					hi = mid - 1;
				} else {

					lo = mid + 1;
				}

			}

			System.out.println(ans);
			t--;
		}
	}

	public static boolean isItPossible(int[] books, int cap, int nos) {

		int students = 1;
		int pagesRead = 0;

		int currBook = 0;

		while (currBook < books.length) {

			if (pagesRead + books[currBook] <= cap) {
				pagesRead += books[currBook];
				currBook++;
			} else {

				students++;
				pagesRead = 0;
			}

			if (students > nos) {
				return false;
			}
		}
		return true;
	}
}
