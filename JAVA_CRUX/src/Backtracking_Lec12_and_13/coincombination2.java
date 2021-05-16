package Backtracking_Lec12_and_13;

public class coincombination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coincombination(new int[] { 2, 3, 5, 6 }, 0, 10, "");
	}

	public static void coincombination(int[] denom, int i, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (i == denom.length || amount < 0)
			return;

		// exclude
		coincombination(denom, i + 1, amount, ans);
		// include
		coincombination(denom, i , amount - denom[i], ans + denom[i]);

	}
}
