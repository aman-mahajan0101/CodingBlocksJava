package assignmentquestions;

import java.util.*;

public class LargestBstInBT {
	static Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public LargestBstInBT(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (ilo > ihi || plo > phi) {
			return null;
		}

		// create a new node with plo
		Node nn = new Node();
		nn.data = pre[plo];

		// search for pre[plo] in inorder
		int si = -1;
		int nel = 0;
		for (int i = ilo; i <= ihi; i++) {

			if (pre[plo] == in[i]) {
				si = i;
				break;
			}

			nel++;
		}

		// left and right child call
		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;

	}

	private class BSTPair1 { // class for checking largest bst hai uski root node kya h aur size kya h

		boolean isBST1 = true;
		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;

		int largestBSTRootNode1;
		int largestBSTSize1;
	}

	public void isTreeBST1() {
		BSTPair1 ans = isTreeBST1(root);

		// System.out.println(ans.largestBSTRootNode1 + " " + ans.largestBSTSize1);
		System.out.println(ans.largestBSTSize1);
	}

	private BSTPair1 isTreeBST1(Node node) {

		if (node == null) {
			return new BSTPair1();
		}

		BSTPair1 lbp = isTreeBST1(node.left);
		BSTPair1 rbp = isTreeBST1(node.right);

		BSTPair1 sbp = new BSTPair1();

		sbp.max1 = Math.max(node.data, Math.max(lbp.max1, rbp.max1));
		sbp.min1 = Math.min(node.data, Math.min(lbp.min1, rbp.min1));

		if (lbp.isBST1 && rbp.isBST1 && node.data > lbp.max1 && node.data < rbp.min1) {
			sbp.isBST1 = true;

			sbp.largestBSTRootNode1 = node.data;
			sbp.largestBSTSize1 = lbp.largestBSTSize1 + rbp.largestBSTSize1 + 1;

		} else {
			sbp.isBST1 = false;

			if (lbp.largestBSTSize1 > rbp.largestBSTSize1) {
				sbp.largestBSTRootNode1 = lbp.largestBSTRootNode1;
				sbp.largestBSTSize1 = lbp.largestBSTSize1;
			} else {
				sbp.largestBSTRootNode1 = rbp.largestBSTRootNode1;
				sbp.largestBSTSize1 = rbp.largestBSTSize1;
			}

		}

		return sbp;

	}

	// --------------

	public static void main(String args[]) {

		int n = scn.nextInt();
		int[] pre = takeinput(n);
		int[] in = takeinput(n);
		LargestBstInBT bt = new LargestBstInBT(pre, in);
		bt.isTreeBST1();
	}

	private static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
}