package assignmentquestions;

import java.util.*;

public class MinimumMoneyNeeded {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int W = scn.nextInt();

		int[] prices = new int[W];

		for (int i = 0; i < W; i++)
			prices[i] = scn.nextInt();
		int[][] strg = new int[prices.length + 1][W + 1];

		for (int[] arr : strg) {
			Arrays.fill(arr, -1);
		}

		System.out.println(MinMoney(prices, 0, prices.length, strg));
	}

	public static int MinMoney(int[] prices, int vidx, int cap, int[][] strg) {

		if (cap == 0) {
			return 0;
		}

		if (vidx == prices.length) {
			return 10000000;
		}

		if (strg[vidx][cap] != -1) {
			return strg[vidx][cap];
		}

		int inc = 10000000;
		if (cap >= vidx + 1 && prices[vidx] != -1) {
			inc = MinMoney(prices, vidx, cap - vidx - 1, strg) + prices[vidx];
		}
		int exc = MinMoney(prices, vidx + 1, cap, strg);

		return strg[vidx][cap] = Math.min(inc, exc);
	}
}
