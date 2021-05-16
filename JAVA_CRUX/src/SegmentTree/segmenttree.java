package SegmentTree;

public class segmenttree {

	private class Node {
		int data;
		int startinterval;
		int endinterval;
		Node left;
		Node right;
	}

	Node root;

	public segmenttree(int[] arr) {

		this.root = constructTree(arr, 0, arr.length - 1);
	}

	private Node constructTree(int[] arr, int si, int ei) {

		if (si == ei) {
			Node leafnode = new Node();
			leafnode.data = arr[si];
			leafnode.startinterval = si;
			leafnode.endinterval = ei;
			return leafnode;
		}

		Node node = new Node();
		node.startinterval = si;
		node.endinterval = ei;

		int mid = (si + ei) / 2;
		node.left = this.constructTree(arr, si, mid);
		node.right = this.constructTree(arr, mid + 1, ei);

		node.data = node.left.data + node.right.data;

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {

		String str = "";
		if (node.left != null) {
			str = str + "Interval=[ " + node.left.startinterval + " - " + node.left.endinterval + " ] and Data => "
					+ node.left.data + " => ";
		} else {
			str = str + "No left child => ";
		}

		str = str + "Interval=[ " + node.startinterval + "-" + node.endinterval + "] and Data =" + node.data;

		if (node.right != null) {
			str = str + " <= data is = " + node.right.data + " and Interval is [ " + node.right.startinterval + " - "
					+ node.right.endinterval + " ]";
		} else {
			str = str + " <= No right child";
		}

		System.out.println(str);
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int query(int qsi, int qei) {
		return this.query(this.root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {

		// node is completly lying inside the query so will contribute its value -
		// -directly to the actual ans
		if (node.startinterval >= qsi && node.endinterval <= qei) {
			return node.data;
		} else if (node.startinterval > qei || node.endinterval < qsi) {
			// node is completly outside query interval
			return 0; // return default value of query
		} else {
			// overlapping case
			int leftans = this.query(node.left, qsi, qei);
			int rightans = this.query(node.right, qsi, qei);
			return leftans + rightans;
		}
	}

	public void update(int idx, int newvalue) {
		this.root.data = this.update(this.root, idx, newvalue);
	}

	private int update(Node node, int idx, int newvalue) {

		if (idx >= node.startinterval && idx <= node.endinterval) {

			if (idx == node.startinterval && idx == node.endinterval) {
				node.data = newvalue;
			} else {
				int leftvalue = this.update(node.left, idx, newvalue);
				int rightvalue = this.update(node.right, idx, newvalue);
				node.data = leftvalue + rightvalue;

			}
		}

		return node.data;
	}

}
