package Lec13;

import java.util.Scanner;

public class NumberofsubstringswhihcharepalinromewithbetterTC {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(check(str));
	}

	public static int check(String str) {

		int count = 0;

		// for odd length of substring

		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		// for even length ofsubstring

		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;

	}
}
