package assignmentquestions;

import java.util.Scanner;

public class quadraticequation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		double x = Math.pow(b, 2);
		double z = x - 4 * a * c;
		double y = Math.pow(z, 0.5);
		int root1 = (int) ((-b + y) / 2 * a);
		int root2 = (int) ((-b - y) / (2 * a));
		if (root1 == root2 && z >= 0) {
			System.out.println("Real and Equal");
			System.out.println(root1 + "\t" + root2);
		} else if (z >= 0 && root1 != root2) {
			System.out.println("Real and Distinct");
			System.out.println(root1 + "\t"+ root2);
		} else if (z < 0) {
			System.out.println("Imaginary");
		}

	}

}
