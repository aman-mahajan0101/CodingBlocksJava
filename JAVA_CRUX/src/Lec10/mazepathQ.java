package Lec10;

import java.util.ArrayList;

public class mazepathQ {

	public static void main(String[] args) {
		System.out.println(mazepath1(0, 0, 2, 2));
		System.out.println(mazepath2(0, 0, 2, 2));
	}

	public static ArrayList<String> mazepath1(int cr, int cc, int er, int ec) {

		// base case
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		if (cc + 1 <= ec) {
			ArrayList<String> rrh = mazepath1(cr, cc + 1, er, ec);
			for (String val : rrh) {
				mr.add("H" + val);

			}
		}

		if (cr + 1 <= er) {
			ArrayList<String> rrv = mazepath1(cr + 1, cc, er, ec);
			for (String val : rrv) {
				mr.add("V" + val);

			}
		}
		return mr;

	}

	public static ArrayList<String> mazepath2(int cr, int cc, int er, int ec) {

		// base case
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}

		// negative base case
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = mazepath2(cr, cc + 1, er, ec);
		for (String val : rrh) {
			mr.add("H" + val);

		}

		ArrayList<String> rrv = mazepath2(cr + 1, cc, er, ec);
		for (String val : rrv) {
			mr.add("V" + val);

		}

		return mr;

	}
}
