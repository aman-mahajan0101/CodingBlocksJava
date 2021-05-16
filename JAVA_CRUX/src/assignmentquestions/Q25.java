package assignmentquestions;

import java.util.Scanner;

public class Q25 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();
		if (sb == 10 && db != 10) {
			int t = fromD(n,db);
			System.out.println(t);
		}
		else if(db==10 && sb!=0)
		{
			int t = toD(n,sb);
			System.out.println(t);
		}
		else
		{
			int t = toD(n,sb);
			int r = fromD(t,db);
			System.out.println(r);
		}
	}

	public static int fromD(int n, int a) {

		int rem, ans = 0;
		int multiplier = 1;// 10^0

		while (n != 0) {
			rem = n % a;

			ans = ans + rem * multiplier;

			n = n / a;
			multiplier = multiplier * 10;
		}
		return ans;
	}

	public static int toD(int n, int a) {
		int rem, ans = 0;
		int multiplier = 1;// a^0

		while (n != 0) {
			rem = n % 10;

			ans = ans + rem * multiplier;

			n = n / 10;
			multiplier = multiplier * a;
		}
		return ans;
	}

}
