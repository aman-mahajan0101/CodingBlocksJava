package Lec9;

public class lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 100, 5, 60, 30, 15, 30 };
		System.out.println(findlastindex(a, 30, 0));
	}

	public static int findlastindex(int[] arr, int item, int idx) {

		if (idx == arr.length)
			return -1;

		int rr = findlastindex(arr, item, idx + 1);

		if (arr[idx] == item && rr == -1)
			return idx;

		return rr;

	}

//	public static int findlastindex2(int[] arr, int item, int idx, int temp) {
//	}
}