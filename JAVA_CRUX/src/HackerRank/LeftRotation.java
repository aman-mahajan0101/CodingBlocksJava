package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'rotateLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
	 */

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {

		int a = arr.size();
		int b = a - d; // As Performing right rotation

		if (b > a) {
			b = b % a;
		}
		if (b < 0) {
			b = b + a;
		}

		for (int r = 1; r <= b; r++) {
			int temp = arr.get(arr.size() - 1);
			for (int i = arr.size() - 1; i >= 1; i--) {
				arr.set(i, arr.get(i - 1));
			}
			arr.set(0, temp);
		}
		
		return arr;
	}
}
