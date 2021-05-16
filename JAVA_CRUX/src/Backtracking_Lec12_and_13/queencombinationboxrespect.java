package Backtracking_Lec12_and_13;

public class queencombinationboxrespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queencombinationboxrespect(new boolean[4], 0, 2, 0, "");
	}

	public static void queencombinationboxrespect(boolean[] board, int col, int tq, int qp, String ans) {

		if (tq == qp) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		// place

		board[col] = true;
		queencombinationboxrespect(board, col + 1, tq, qp + 1, ans+" b" + col);
		board[col] = false;

		// not placed
		queencombinationboxrespect(board, col + 1, tq, qp, ans);

	}
}
