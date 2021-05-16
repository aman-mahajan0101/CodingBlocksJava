package Lec14;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primes(125);
	}

	public static void primes(int n) {
		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);
		primes[0]=primes[1]=false;

		for (int tables = 2; tables * tables <= n; tables++) {
			if (primes[tables] == true) {
				for (int mul = 2; mul * tables <= n; mul++) {
					primes[mul * tables] = false;
				}
			}
		}

		for (int j = 0; j < primes.length; j++) {
			if (primes[j])
				System.out.println(j);
		}
	}

}
