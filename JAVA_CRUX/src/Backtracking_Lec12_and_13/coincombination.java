package Backtracking_Lec12_and_13;

public class coincombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coincombination(new int[] { 2, 3, 5, 6 }, 10, "", 0);
	}

	public static void coincombination(int[] denom, int amount, String ans, int lastidx) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = lastidx; i < denom.length; i++) {
			if (amount >= denom[i]) {
				coincombination(denom, amount - denom[i], ans + denom[i], i);
			}

		}
	}
}
