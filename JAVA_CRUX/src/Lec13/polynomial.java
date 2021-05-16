package Lec13;

public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(polynomial(3, 5));
	}

	public static int polynomial(int x, int n) {

		int sum = 0, mul = x;
		for (int coeff = n; coeff >= 1; coeff--) {
			sum = sum + coeff * mul;
			mul = mul * x;
		}
		return sum;
	}

}
