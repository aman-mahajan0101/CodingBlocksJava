package Lec13;

public class powerusingrecursionwithbetterTC {
	public static void main(String[] args) {

		System.out.println(power(2, 5));
	}

	public static int power(int x, int n) {
		if (n == 0)
			return 1;

		int rr = power(x, n / 2);
		if (n % 2 == 0) {
			return rr * rr;
		} else {
			return rr * rr * x;
		}
	}
}
