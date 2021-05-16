package assignmentquestions;

import java.util.*;

public class LeafNodes {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public LeafNodes() {

		Queue<Node> q = new LinkedList<>();

		int item = scn.nextInt();

		if (item == -1) {
			return;
		}

		root = new Node(item);
		q.add(root);

		while (!q.isEmpty()) {

			Node pn = q.remove();

			int ld = scn.nextInt();

			if (ld != -1) {

				Node ln = new Node(ld);
				pn.left = ln;
				q.add(ln);

			}

			int rd = scn.nextInt();

			if (rd != -1) {

				Node rn = new Node(rd);
				pn.right = rn;
				q.add(rn);

			}

		}

	}

	public void display() {
		ArrayList<Integer> Result = display(root);
		for (int val : Result)
			System.out.print(val + " ");
	}

	private ArrayList<Integer> display(Node node) {
		ArrayList<Integer> res = new ArrayList<>();
		// base case
		if (node == null) {
			ArrayList<Integer> br = new ArrayList<>();
			return br;
		}
		ArrayList<Integer> rl = display(node.left);
		for (int val : rl) {
			res.add(val);
		}

		ArrayList<Integer> rr = display(node.right);
		for (int val : rr) {
			res.add(val);
		}
		if (node.left == null && node.right == null)
			res.add(node.data);
		// smaller problems

		return res;
	}

	public static void main(String args[]) {
		LeafNodes tree = new LeafNodes();
		tree.display();
	}
}