package assignmentquestions;

import java.util.*;

public class KthfromLast {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node() {

		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void addlast(int item) {
		// create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			size++;
		}
	}

	public int kthFromLast(int k) {

		Node slow = head;
		Node fast = head;

		// create a gap of k b/w slow and fast
		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}

		// move both the pointers with uniform speed
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow.data;
	}

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		KthfromLast list = new KthfromLast();
		int n = 1;
		while (n != -1) {

			list.addlast(n);

			n = scn.nextInt();

		}

		int k = scn.nextInt();
		System.out.println(list.kthFromLast(k));
	}
}
