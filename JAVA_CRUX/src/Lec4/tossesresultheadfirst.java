package Lec4;

import java.util.Scanner;

public class tossesresultheadfirst {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int result = (int) Math.pow(2, n);
		int nst = n-1;
		int cnt = 0;
		while (cnt < result) {

			int ans = DtoB(cnt);
			int cst = 1;

			int t = ans;

			int c = (int) Math.pow(10, n - 1);

			if ((t / c) == 0) {
				
				System.out.print("H");
				t = t % (int) Math.pow(10, n - 1);
				while (cst <= nst) {
					if (t % 10 == 0) {
						System.out.print("H");
						t = t / 10;
					} else {
						System.out.print("T");
						t = t / 10;
					}

					cst++;
				}
			}

			else {
				System.out.print("T");
				t = t % (int) Math.pow(10, n - 1);
				while (cst <= nst) {
					if (t % 10 == 0) {
						System.out.print("H");
						t = t / 10;
					} else {
						System.out.print("T");
						t = t / 10;
					}

					cst++;
				}
			}
			System.out.println();
			cnt++;
		}
	}

	public static int DtoB(int n) {
		int rem, ans = 0;
		int multiplier = 1;// 10^0

		while (n != 0) {
			rem = n % 2;

			ans = ans + rem * multiplier;

			n = n / 2;
			multiplier = multiplier * 10;
		}
		return ans;
	}
}
