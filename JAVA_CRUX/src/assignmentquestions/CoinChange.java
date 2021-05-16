package assignmentquestions;

import java.util.*;

public class CoinChange {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in); // for taking input
		int num = scn.nextInt();
		int M = scn.nextInt();
		int[] deno = new int[M];
		for (int i = 0; i < M; i++) {
			deno[i] = scn.nextInt();
		}
		scn.close();

		System.out.println(chnge(num, deno)); // printing the result

	}

	private static int chnge(int target, int[] coins) {
		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int c : coins) {
			for (int tar = 0; tar <= target; tar++) {
				if (tar - c >= 0)
					dp[tar] += dp[tar - c];
			}
		}
		return dp[target];
	}
}
