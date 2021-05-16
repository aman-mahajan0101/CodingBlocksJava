package Lec11;

import java.util.ArrayList;

public class boardpathusingprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boardpath(0, 10, "");
		boardpath1(0, 10, "");
	}

	public static void boardpath(int curr, int end, String ans) {
		//base case
		if (curr == end) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 1; i <= 6 && curr + i <= end; i++) {
			boardpath(curr + i, end, ans + i);
		}
	}

	public static void boardpath1(int curr, int end, String ans) {
		//base case
		if (curr == end) {
			System.out.println(ans + " ");
			return;
		}
		//negative base case
		if (curr > end) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			boardpath(curr + i, end, ans + i);
		}
	}

}
