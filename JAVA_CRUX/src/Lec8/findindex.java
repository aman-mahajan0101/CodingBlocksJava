package Lec8;

public class findindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 100, 5, 60, 30, 15, 30 };
		System.out.println(findfirstindex(a, 0, 30));
	}

	public static int findfirstindex(int[] arr, int idx, int item) {

		if (idx == arr.length)
			return -1;

		if (arr[idx] == item)
			return idx;

		return findfirstindex(arr, idx + 1, 30);

	}

}
