package Lec3;

import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int t, cnt2;
		t = n;
		int cnt = 0;
		while (t != 0) {
			t = t / 10;
			cnt++;
		}
		t = n;
		// System.out.println(cnt);

		if (rot > 0) {
			while (rot > 0) {
				int rem;
				int p;
				rem = n % 10;
				cnt2 = cnt - 1;
				n = n / 10;
				p = (int) Math.pow(10, cnt2);
				n = n + rem * p;
				rot--;
			}
		} else if (rot == 0) {
			n = n;
		} else {
			while (rot < 0) {
				int rem;
				cnt2 = cnt - 1;
				rem = t % (int) Math.pow(10, cnt2);
				t = t / (int) Math.pow(10, cnt2);
				t = rem * 10 + t;
				rot++;
			}
		}
		n = t;
		// System.out.println(t);
		System.out.println(n);
	}

}
