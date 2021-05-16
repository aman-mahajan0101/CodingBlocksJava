package Backtracking_Lec12_and_13;

public class Queenspermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenpermutation(new boolean[4], 0, 2, "");
	}

	public static void queenpermutation(boolean[] boxes, int qp, int tq, String ans) {
		if (qp == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				queenpermutation(boxes, qp + 1, tq, ans + "q" + qp + "b" + i + " ");
				boxes[i] = false;   //undo step in abcktrackking

			}

		}

	}

}
