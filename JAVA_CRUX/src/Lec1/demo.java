
package Lec1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(String val : args)
//		{
//			System.out.println(val);
//		}
//			System.out.println("Hello World");
//	}
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] x = new int[n];
		int ans = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = scn.nextInt();

			if (x[i] % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}