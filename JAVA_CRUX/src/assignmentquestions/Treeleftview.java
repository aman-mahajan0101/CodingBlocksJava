package assignmentquestions;

import java.util.*;


public class Treeleftview {

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

	public Treeleftview() {

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
		System.out.println("----------------");
		display(root);
		System.out.println("----------------");
	}

	private void display(Node node) {

		// base case
		if (node == null) {
			return;
		}

		// self work
		String str = "";

		if (node.left == null)
			str += ".";
		else
			str += node.left.data;

		str += "->" + node.data + "<-";

		if (node.right == null)
			str += ".";
		else
			str += node.right.data;

		System.out.println(str);

		// smaller problems
		display(node.left);
		display(node.right);
	}
	
	//-----------------------------------------------
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
	//-----------------------------------------------

	public static void main(String[] args) {

		Treeleftview tree = new Treeleftview();
	//	tree.display();
		tree.LeftView();
	}

}