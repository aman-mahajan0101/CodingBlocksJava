package Lec8;

public class maxinarrayrecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 100, 5, 60, 30, 15 };
		System.out.println(max(a, 0));
	}

	public static int max(int[] arr, int idx) {
		if (idx == arr.length - 1)
			return arr[idx];
		int maxtillnow = max(arr, idx + 1);
		if (arr[idx] > maxtillnow)
			return arr[idx];
		else
			return maxtillnow;
	}

}
