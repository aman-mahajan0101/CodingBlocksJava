package Lec8;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(3));

	}

	public static int fibonacci(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		n = fibonacci(n - 1) + fibonacci(n - 2);

		return n;
	}
}
