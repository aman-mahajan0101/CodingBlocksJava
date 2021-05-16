package assignmentquestions;

import java.util.Scanner;

public class chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(chessboard(0, 0, n - 1, n - 1, ""));
	}

	public static int chessboard(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans + "{" + er + "-" + ec + "}");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int cnt = 0;
		cnt += chessboard(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		cnt += chessboard(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cc == ec || cr == er) {
			for (int move = 1; cc + move <= ec; move++) {

				cnt += chessboard(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

			for (int move = 1; cr + move <= er; move++) {

				cnt += chessboard(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
		}

		if (cr == cc || cr + cc == er) {
			for (int move = 1; cr + move <= er && cc + move <= ec; move++) {

				cnt += chessboard(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B");

			}
		}
		return cnt;

	}
}
