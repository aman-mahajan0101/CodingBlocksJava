package Lec8;

public class powerusingrecursion {
	public static void main(String[] args) {

		System.out.println(power(2, 10));
	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}
		int pow = power(x, n - 1);
		int res = x * pow;

		return res;
	}
}
