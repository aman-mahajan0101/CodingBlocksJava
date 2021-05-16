package Try;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();

		int count = 0;
		int total = 1;
		while (count != total) {
			int num = scn.nextInt();
			ar.add(num);
			if (num != -1) {
				total++;
			}
			if (num == -1) {
				count++;
			}
		}

		int[] arr = new int[ar.size()];
		for (int i = 0; i < ar.size(); i++) {
			arr[i] = ar.get(i);
		}
		// System.out.println(ar);
		// Main m = new Main();
		Main bt = new Main(arr);

		bt.LeftView();

	}

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Main(int[] arr) {
		root = takeinput(arr, 0);
	}

	private Node takeinput(int[] arr, int i) {
		if (i < arr.length - 1 && arr[i] == -1) {
			return null;
		}
		Node nn = new Node();
		nn.data = arr[i];
		if ((2 * i + 1) < arr.length - 1)
			nn.left = takeinput(arr, 2 * i + 1);
		if ((2 * i + 2) < arr.length - 1)
			nn.right = takeinput(arr, 2 * i + 2);

		return nn;
	}

	public void LeftView() {

		int[] max = new int[1];
		max[0] = -1;
		view(root, 0, max);

	}

	public void view(Node root, int level, int[] maxLevel) {

		if (root == null) {
			return;
		}

		if (level > maxLevel[0]) {
			System.out.print(root.data + " ");
			maxLevel[0] = level;
		}

		view(root.left, level + 1, maxLevel);
		view(root.right, level + 1, maxLevel);
	}

}