package Backtracking_Lec12_and_13;

public class blockedmaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'o', 'x', 'o', 'o' }, { 'o', 'o', 'o', 'o' }, { 'o', 'x', 'o', 'o' },
				{ 'o', 'o', 'x', 'o' } };
		blockedmaze(board, 0, 0, " ", new boolean[board.length][board[0].length]);
	}

	public static void blockedmaze(char[][] board, int row, int col, String ans, boolean[][] visited) {

		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == 'x'
				|| visited[row][col]) {
			return;
		}

		visited[row][col] = true;

		blockedmaze(board, row - 1, col, ans + "T", visited);
		blockedmaze(board, row + 1, col, ans + "D", visited);
		blockedmaze(board, row, col - 1, ans + "L", visited);
		blockedmaze(board, row, col + 1, ans + "R", visited);
		visited[row][col] = false;

	}

}
