package Backtracking_Lec12_and_13;

public class queencombinationboxrespect2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queencombinationboxrespect(new boolean[2][3], 0, 0, 2, 0, "");
	}

	public static void queencombinationboxrespect(boolean[][] board, int row, int col, int tq, int qp, String ans) {

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

		board[row][col] = true;
		queencombinationboxrespect(board, row, col + 1, tq, qp + 1, ans + "[" + row + "- " + col + "]");
		board[row][col] = false;

		// not placed
		queencombinationboxrespect(board, row, col + 1, tq, qp, ans);

	}
}
