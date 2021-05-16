package assignmentquestions;

import java.util.Scanner;

public class towerofhanoi {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(hanoi(n, "T1", "T3", "T2"));
	}

	public static int hanoi(int n, String a, String b, String c) {
		int cnt = 0;
		if (n == 1) {
			System.out.println("Move " + n + "th disc from " + a + " to " + c);
			return 1;
		} else {
			cnt += hanoi(n - 1, a, c, b);
			System.out.println("Move " + n + "th disc from " + a + " to " + c);
			cnt += hanoi(n - 1, b, a, c);
		}
		return cnt + 1;
	}
}