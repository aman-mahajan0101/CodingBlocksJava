package assignmentquestions;

import java.util.Scanner;

public class arraytargetsumpairs {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int target;
		int[] a = takeinput();
		target = scn.nextInt();
		int len = a.length - 1;
		int cnt = 0;
		if ((a.length/2) % 2 != 0) {
			for (int i = 0; i < a.length / 2; i++) {
				cnt = 0;
				while (cnt <= len) {
					int sum = 0;
					sum = sum + a[i] + a[cnt];
					if (sum == target) {
						System.out.println((int) Math.min(a[i], a[cnt]) + " and " + (int) Math.max(a[i], a[cnt]));
					}
					cnt++;
				}

			}
		}
		else
		{
			for (int i = 0; i < a.length / 2 + 1; i++) {
				cnt = 0;
				while (cnt <= len) {
					int sum = 0;
					sum = sum + a[i] + a[cnt];
					if (sum == target) {
						System.out.println((int) Math.min(a[i], a[cnt]) + " and " + (int) Math.max(a[i], a[cnt]));
					}
					cnt++;
				}

			}
		}
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
}
