package DynamicProcessing;

//import javax.swing.plaf.synth.SynthSliderUI;

public class BoardPath {

	public static void main(String[] args) {
		int N = 100000;
//		System.out.println(BPRecursion(0, N));
//		System.out.println(BPTD(0, N, new int[N]));
//		System.out.println(BPBU(N));
		System.out.println(BPBUSE(N));
	}

	public static int BPRecursion(int curr, int end) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int cnt = 0;
		for (int dice = 1; dice <= 6; dice++) {
			cnt += BPRecursion(curr + dice, end);
		}
		return cnt;
	}

	public static int BPTD(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}
		int cnt = 0;

		for (int dice = 1; dice <= 6; dice++) {
			cnt += BPTD(curr + dice, end, strg);
		}

		strg[curr] = cnt; // store

		return cnt;
	}

	// TC and SC : O(n) and O(n)

	public static int BPBU(int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}

		return strg[0];
	}

	// TC and SC : O(n) and O(1)
	public static int BPBUSE(int end) {
		int[] strg = new int[6];
		strg[0] = 1;

		for (int slide = 1; slide <= end; slide++) {

			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}

		return strg[0];
	}
}
