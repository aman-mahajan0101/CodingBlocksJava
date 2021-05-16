package Lec9;

public class findallindex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 100, 5, 60, 30, 15, 30 };
		int[] res = allindex(a, 0, 30, 0);

		for (int val : res)
			System.out.print(val + " ");

	}

	public static int[] allindex(int[] arr, int idx, int item, int count) {

		if (idx == arr.length) {
			int[] br = new int[count];
			return br;
		}
		if (arr[idx] == item) {
			int[] rr = allindex(arr, idx + 1, item, count + 1);
			rr[count] = idx;
			return rr;
		} else {
			int[] rr = allindex(arr, idx + 1, item, count);
			return rr;
		}
	}
}