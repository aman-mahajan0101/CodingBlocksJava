package assignmentquestions;

import java.util.Scanner;

public class evenoddbackindelhi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		while (n > 0) {
			int t = scn.nextInt();
			int a = t;
			int sumo = 0;
			int sume = 0;
			while (a != 0) {
				int rem = a % 10;

				if (rem % 2 == 0) {
					sume = sume + rem;
				} else {
					sumo = sumo + rem;
				}
				a = a / 10;
			}

			if (sumo % 3 == 0 || sume % 4 == 0) {
				System.out.println("Yes");

			} else {
				System.out.println("No");
			}
			n--;
		}
	}
}
