package Backtracking_Lec12_and_13;

public class Nknights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nknights(new boolean[4][4], 0, 0, 8, 0, "");
	}

	static int count = 0;

	public static void Nknights(boolean[][] board, int row, int col, int tq, int qp, String ans) {

		if (tq == qp) {
			System.out.println(++count + ans);
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
		if (isitsafe2(board, row, col)) {
			board[row][col] = true;
			Nknights(board, row, col + 1, tq, qp + 1, ans + "[" + row + "- " + col + "]");
			board[row][col] = false;
		}
		// not placed
		Nknights(board, row, col + 1, tq, qp, ans);

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {

		// vertically up and left

		int r = row - 2;
		int c = col - 1;

		if (r >= 0 && c >= 0 && board[r][c] == true) {
			return false;

		}

		// vertically up and right

		r = row - 2;
		c = col + 1;

		if (r >= 0 && c < board[0].length && board[r][c] == true)
			return false;

		// horizontally up and left

		r = row - 1;
		c = col - 2;

		if (r >= 0 && c >= 0 && board[r][c] == true)
			return false;

		// horizontally up and right
		r = row - 1;
		c = col + 2;

		if (r >= 0 && c < board[0].length && board[r][c] == true)
			return false;

		return true;
	}

	public static boolean isitsafe2(boolean[][] board, int row, int col) {
		int[] rowarr = { -2, -2, -1, -1 };
		int[] colarr = { -1, 1, -2, 2 };

		for (int i = 0; i < colarr.length; i++) {

			int nr = row + rowarr[i];
			int nc = col + colarr[i];

			if (nr >= 0 && nc >= 0 && nc < board[0].length && nr < board.length) {
				if (board[nr][nc])
					return false;
			}
		}
		return true;
	}
}
