package assignmentquestions;

import java.util.Scanner;

public class subsetproblem {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		subsets(arr, 0, 0, 3, "");
	}

	public static int[] takeinput(int size) {
		int n = size;
		int[] arr = new int[n];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void subsets(int[] arr, int vidx, int ssf, int target, String ans) {

		if (vidx == arr.length) {

			if (ssf == target) {
				System.out.print(ans + " ");
				return;
			}
		}
		subsets(arr, vidx + 1, ssf + arr[vidx], target, ans + arr[vidx] + " ");
		subsets(arr, vidx + 1, ssf, target, ans);

	}
}