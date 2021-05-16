package Lec9;

import java.util.ArrayList;

public class getsubsequences {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
		System.out.println(count);
	}

	public static ArrayList<String> getSS(String str) {

		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();

		// self work
		for (String val : rr) {
			mr.add(val); // no
			mr.add(ch + val); // yes
		}
		count = mr.size();
		return mr;

	}
}
