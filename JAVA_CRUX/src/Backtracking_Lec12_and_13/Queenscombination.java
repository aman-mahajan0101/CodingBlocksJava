package Backtracking_Lec12_and_13;

public class Queenscombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queencombination(new boolean[4], 0, 2, "", -1);
	}

	public static void queencombination(boolean[] boxes, int qp, int tq, String ans, int lastbox) {
		if (qp == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = lastbox + 1; i < boxes.length; i++) {

			boxes[i] = true;
			queencombination(boxes, qp + 1, tq, ans + "q" + qp + "b" + i + " ", i);
			boxes[i] = false; // undo step in abcktrackking

		}

	}

}
