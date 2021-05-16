package Backtracking_Lec12_and_13;

public class wordsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'A', 'E' } };
		String word = "SEA";
		
		for(int i = 0; i < board.length;i++)
		{
			for (int j = 0; j < board[0].length; j++) {
				
				if(board[i][j]==word.charAt(0))
				{
		//			wordsearch(board, i, j, word, , new boolean [board.length][board[0].length);
				}
				
			}
		}
	}

	public static void wordsearch(char[][] board, int row, int col, String word, int idx, boolean[][] visited) {
		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col]) {
			return;
		}

		if (board[row][col] != word.charAt(idx)) {
			return;
		}
		if (idx == word.length() - 1) {
			System.out.println("word found");
			return;
		}
		visited[row][col] = true;
		wordsearch(board, row - 1, col, word, idx, visited);// T
		wordsearch(board, row + 1, col, word, idx, visited);// D
		wordsearch(board, row, col - 1, word, idx, visited);// L
		wordsearch(board, row, col + 1, word, idx, visited);// R
		visited[row][col] = false;
	}
}
