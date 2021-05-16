package DynamicProcessing;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 10000;
//		 System.out.println(FibRecursion(10));
//		System.out.println(FibTD(n, new int[n + 1]));
//		System.out.println(FibBU(n));
		System.out.println(FibBUSE(n));
	}

	// TC : 2^n SC : Rec extra space
	public static int FibRecursion(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = FibRecursion(n - 1);
		int fnm2 = FibRecursion(n - 2);

		int fn = fnm1 + fnm2;

		return fn;
	}

	// TC : o(n) SC : o(n) + Rec extra space
	public static int FibTD(int n, int[] strg) { // top down DP
		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = FibTD(n - 1, strg);
		int fnm2 = FibTD(n - 2, strg);

		int fn = fnm1 + fnm2;

		strg[n] = fn; // store

		return fn;

	}

	// TC : o(n) SC: o(n)
	public static int FibBU(int n) {
		// array of size n+2
		int[] strg = new int[n + 1];

		// base case value fill
		strg[0] = 0;
		strg[1] = 1;

		// filling direction
		for (int i = 2; i <= n; i++) {

			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int FibBUSE(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}

}
