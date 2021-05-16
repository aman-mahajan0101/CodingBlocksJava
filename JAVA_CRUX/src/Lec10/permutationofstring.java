package Lec10;

import java.util.ArrayList;

public class permutationofstring {

	public static void main(String[] args) {

		System.out.println(getPermutation1("abc"));

		System.out.println(getPermutation2("abc"));
	}

	public static ArrayList<String> getPermutation1(String str) {
		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = getPermutation1(ros);
		ArrayList<String> mr = new ArrayList<>();
		// self work
		
		// using string
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				String res = val.substring(0, i) + ch + val.substring(i);
				mr.add(res);
			}

		}
		return mr;
	}

	public static ArrayList<String> getPermutation2(String str) {
		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = getPermutation2(ros);
		ArrayList<String> mr = new ArrayList<>();
		// self work

		// using stringbuilder
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				StringBuilder sb = new StringBuilder(val);
				sb.insert(i, ch);
				mr.add(sb.toString());
			}

		}
		return mr;
	}
}
