package assignmentquestions;

import java.util.*;

public class IsBalanced {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public IsBalanced() {
		root = takeInput(null, false);
	}

	private Node takeInput(Node parent, boolean ilc) {

		// take input of data from user
		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();

		// update the data of node
		nn.data = item;

		// ask user if the node has left child
		// System.out.println(nn.data + " has left child ?");

		// take input either true or false
		boolean hlc = scn.nextBoolean();

		// if left child exists, then create it
		if (hlc) {
			nn.left = takeInput(nn, true);
		}

		// ask user if the node has right child
		// System.out.println(nn.data + " has right child ?");

		// take input either true or false
		boolean hrc = scn.nextBoolean();

		// if right child exists, then create it
		if (hrc) {
			nn.right = takeInput(nn, false);
		}

		// node is ready, now return the node
		return nn;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	public boolean isBalanced2() {
		return isBalanced2(root);
	}

	private boolean isBalanced2(Node node) {

		if (node == null) {
			return true;
		}

		boolean lb = isBalanced2(node.left);
		boolean rb = isBalanced2(node.right);

		int bf = ht(node.left) - ht(node.right);

		if (lb && rb && bf >= -1 && bf <= 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		IsBalanced bt = new IsBalanced();
		System.out.println(bt.isBalanced2());
	}

}
