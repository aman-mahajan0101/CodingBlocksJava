package Lec10;

import java.util.ArrayList;

import Lec5.array1;

public class boardpath {

	public static void main(String[] args) {
		System.out.println(boardpath1(3,3));
		// System.out.println(boardpath2(0, 10));

	}

	public static ArrayList<String> boardpath1(int curr, int end) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int i = 1; i <= 6 && curr + i <= end; i++) {
			ArrayList<String> rr = boardpath1(curr + i, end);
			for (String val : rr) {
				mr.add(i + val);
			}
		}

		return mr;

	}

	private static ArrayList<String> boardpath2(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();

			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

		for (int i = 1; i <= 6; i++) {
			ArrayList<String> rr = boardpath2(curr + i, end);
			for (String val : rr) {
				mr.add(i + val);
			}
		}

		return mr;

	}

}
