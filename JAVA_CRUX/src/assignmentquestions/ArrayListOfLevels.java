package assignmentquestions;

import java.util.*;

public class ArrayListOfLevels {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListOfLevels m = new ArrayListOfLevels();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			ArrayList<ArrayList<Integer>> main = new ArrayList<>();
			ArrayList<Integer> temp = new ArrayList<>();
			LinkedList<Node> queue = new LinkedList<>();
			// add root node
			queue.addLast(root);
			queue.addLast(null);
			while (!queue.isEmpty()) {
				// remove node
				Node rn = queue.removeFirst();

				if (rn == null) {
					main.add(new ArrayList<>(temp));

					while (!temp.isEmpty()) {
						temp.remove(temp.size() - 1);
					}
					if (queue.isEmpty()) {
						return main;
					} else {
						queue.addLast(null);
					}
				} else {

					// print removed node

					temp.add(rn.data);
					// System.out.print(rn.data + " ");
					if (rn.left != null) {
						queue.addLast(rn.left);
					}
					if (rn.right != null) {
						queue.addLast(rn.right);
					}
				}

			}

			return main;
		}

	}

}
