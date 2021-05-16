package assignmentquestions;

import java.util.Scanner;

public class chessboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char[][] mat = fillArray(n);
		System.out.println(chessboard2(0, 0, n - 1, n - 1, mat, ""));
	}

	public static int chessboard2(int cr, int cc, int er, int ec, char[][] mat, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans + "{" + er + "-" + ec + "}");
			return 1;
		}

		if (cr > er || cc > ec || mat[cr][cc] == 'M') {
			return 0;
		}

		int cnt = 0;
		if (mat[cr][cc] == 'P') {
			cnt += chessboard2(er, ec, er, ec, mat, ans + "{" + cr + "-" + cc + "}P");
		}

		cnt += chessboard2(cr + 2, cc + 1, er, ec, mat, ans + "{" + cr + "-" + cc + "}K");
		cnt += chessboard2(cr + 1, cc + 2, er, ec, mat, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cc == ec || cr == er) {
			for (int move = 1; cc + move <= ec; move++) {

				cnt += chessboard2(cr, cc + move, er, ec, mat, ans + "{" + cr + "-" + cc + "}R");
			}

			for (int move = 1; cr + move <= er; move++) {

				cnt += chessboard2(cr + move, cc, er, ec, mat, ans + "{" + cr + "-" + cc + "}R");
			}
		}

		if (cr == cc || cr + cc == er) {
			for (int move = 1; cr + move <= er && cc + move <= ec; move++) {

				cnt += chessboard2(cr + move, cc + move, er, ec, mat, ans + "{" + cr + "-" + cc + "}B");

			}
		}

		return cnt;
	}

	public static char[][] fillArray(int n) {

		char[][] matrix = new char[n][n];

		int count = 1;
		boolean isMine = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (isPrime(count)) {

					if (isMine) {
						matrix[i][j] = 'M';
					} else {
						matrix[i][j] = 'P';
					}

					isMine = !isMine;
				} else {
					matrix[i][j] = 'R';
				}

				count++;
			}
		}

		for (char[] charray : matrix) {
			for (char ch : charray) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

		return matrix;

	}

	public static boolean isPrime(int n) {

		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
