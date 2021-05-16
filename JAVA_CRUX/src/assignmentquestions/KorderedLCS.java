package assignmentquestions;

import java.util.*;

public class KorderedLCS {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int k = scn.nextInt();
		int[] a1 = new int[a];
		int[] b1 = new int[b];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		for (int i = 0; i < b1.length; i++) {
			b1[i] = scn.nextInt();
		}
		System.out.println(kOrderedLCSBU(a1, b1, k));
	}

	public static int kOrderedLCSBU(int[] s1, int[] s2, int tk) {

		int[][][] strg = new int[tk + 1][s1.length + 1][s2.length + 1];

		for (int k = 0; k <= tk; k++) {

			for (int row = s1.length - 1; row >= 0; row--) {

				for (int col = s2.length - 1; col >= 0; col--) {

					int ans = 0;

					if (s1[row] == s2[col]) {
						ans = strg[k][row + 1][col + 1] + 1;
					} else {
						int o1 = strg[k][row][col + 1];
						int o2 = strg[k][row + 1][col];
						int o3 = 0;

						if (k >= 1)
							o3 = strg[k - 1][row + 1][col + 1] + 1;

						ans = Math.max(o1, Math.max(o2, o3));

					}

					strg[k][row][col] = ans;

				}
			}

		}

		return strg[tk][0][0];

	}

}