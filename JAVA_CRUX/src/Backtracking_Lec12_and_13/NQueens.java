package Backtracking_Lec12_and_13;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nqueens(new boolean[4][4], 0, 0, 4, 0, "");
		// Nqueens2(new boolean[4][4], 0, "");
		kQueens(new boolean[4][4], 0, 4, 0, "");
	}

	public static void Nqueens(boolean[][] board, int row, int col, int tq, int qp, String ans) {

		if (tq == qp) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// place

		if (isitsafe(board, row, col)) {
			board[row][col] = true;

			Nqueens(board, row, col + 1, tq, qp + 1, ans + "[" + row + "- " + col + "]");
			board[row][col] = false;
		}

		// not placed
		Nqueens(board, row, col + 1, tq, qp, ans);

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {

		// vertically up

		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}
		// horizontally up

		r = row;
		c = col - 1;

		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}
		// daigonally left

		r = row - 1;
		c = col - 1;

		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}

		// daigonally right
		r = row - 1;
		c = col + 1;

		while (c < board[0].length && r >= 0) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}

	public static void Nqueens2(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board.length; col++) {

			if (isitsafe(board, row, col)) {

				board[row][col] = true;
				Nqueens2(board, row + 1, ans + "[" + row + " - " + col + "]");
				board[row][col] = false;
			}
		}
	}

	static int count = 0;

	public static void kQueens(boolean[][] board, int row, int tq, int qpsf, String ans) {

		if (tq == qpsf) {
			System.out.println(++count + ans);
			return;
		}
//
		// negative base case
		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board.length; col++) {

			if (isitsafe(board, row, col)) {

				board[row][col] = true;
				kQueens(board, row + 1, tq, qpsf + 1, ans + "[" + row + " - " + col + "]");
				board[row][col] = false;
			}
		}

		kQueens(board, row + 1, tq, qpsf, ans);

	}

}