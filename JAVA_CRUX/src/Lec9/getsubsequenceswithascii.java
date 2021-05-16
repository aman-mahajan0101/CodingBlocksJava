package Lec9;

import java.util.ArrayList;

public class getsubsequenceswithascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("ab"));
	}

	public static ArrayList<String> getSS(String str) {

		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		int t = ch;
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();

		// self work
		for (String val : rr) {
			mr.add(val); // no
			mr.add(ch + val); // yes
			mr.add(t + val);
		}
		return mr;
	}
}
