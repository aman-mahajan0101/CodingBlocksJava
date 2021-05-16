package assignmentquestions;

import java.util.Scanner;

public class alexshopping {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		int q = scn.nextInt();

		shopping(arr, q);
	}

	public static void shopping(int[] arr, int q) {
		int[] abc = new int[q];
		for (int j = 0; j < q; j++) {
			int cnt = 0;
			int a = scn.nextInt();
			int k = scn.nextInt();
			for (int i = 0; i < arr.length; i++) {

				if (a % arr[i] == 0)

					cnt++;

			}
			if (cnt >= k)
				abc[j] = 1;
			else
				abc[j] = 0;

		}
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] == 1)
				System.out.println("Yes");
			else
				System.out.println("no");
		}
	}
}
