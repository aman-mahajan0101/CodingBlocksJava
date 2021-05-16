package assignmentquestions;

import java.util.*;

public class LevelOrder_NewLine {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LevelOrder_NewLine m = new LevelOrder_NewLine();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {
			if (root != null) {
				System.out.println(root.data);
				ArrayList<Node> list = new ArrayList<>();
				list.add(root);
				level(list);
			}
		}

		private void level(ArrayList<Node> list) {
			if (list.isEmpty())
				return;
			StringBuilder sb = new StringBuilder();
			ArrayList<Node> nl = new ArrayList<>();
			for (Node node : list) {
				if (node.left != null) {
					sb.append(node.left.data);
					nl.add(node.left);
				}
				sb.append(" ");
				if (node.right != null) {
					sb.append(node.right.data);
					nl.add(node.right);
				}
				sb.append(" ");
			}
			if (sb.length() == 0)
				return;
			System.out.println(sb);
			level(nl);
		}

	}

}
