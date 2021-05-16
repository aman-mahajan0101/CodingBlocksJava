package assignmentquestions;

import java.util.Arrays;
import java.util.Scanner;

public class aggressivecow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int nos = scn.nextInt();
		int noc = scn.nextInt();
		
		int[] stalls = new int[nos];
		for (int i = 0; i < nos; i++) {
			stalls[i] = scn.nextInt();
		}

		Arrays.sort(stalls);
		int lo = 0;
		int hi = stalls[nos - 1] - stalls[0];

		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(stalls, noc, mid)) {

				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean isItPossible(int[] stalls, int noc, int min) {

		int cows = 1;
		int LastCowPlaced = stalls[0];

		for (int i = 1; i < stalls.length; i++) {

			if (stalls[i] - LastCowPlaced >= min) {
				cows++;
				LastCowPlaced = stalls[i];
			}

			if (cows == noc) {
				return true;
			}

		}

		return false;

	}

}
