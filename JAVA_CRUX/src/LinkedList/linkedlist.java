package LinkedList;

import java.util.EmptyStackException;

public class linkedlist {

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

	// O(n)
	public void display() {
		System.out.println("------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;

		}
		System.out.println(".");
		System.out.println("------------------------");

	}

	// O(1)
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

	// O(1)
	public void addfirst(int item) {
		// create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size >= 1) {

			nn.next = head;
		}

		// sumamry object updation
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}

	}

	// O(1)
	public int getfirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		return this.head.data;
	}

	// O(1)
	public int getlast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		return this.tail.data;
	}

	// O(n)
	public int getat(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	// O(n)
	public Node getnodeat(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(n)
	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid index");
		}
		if (idx == 0) {
			addfirst(item);
		} else if (idx == size) {
			addlast(item);
		} else {
			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			Node nm1 = getnodeat(idx - 1);
			Node np1 = nm1.next; // getnodeat(idx)

			nm1.next = nn;
			nn.next = np1;

			// update summary
			this.size++;
		}
	}

	// O(1)
	public int removefirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		int rv = this.head.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			size--;
		}

		return rv;

	}

	// O(n)
	public int removelast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		int rv = this.tail.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node lm1 = getnodeat(size - 2);
			this.tail = lm1;
			this.tail.next = null;
			size--;
		}

		return rv;

	}

	// O(n)
	public int removeat(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");
		}

		if (idx == 0) {
			return removefirst();
		} else if (idx == this.size - 1) {
			return removelast();
		} else {
			Node nm = getnodeat(idx - 1);
			Node n = getnodeat(idx);
			Node np = getnodeat(idx + 1);

			nm.next = np;
			this.size--;

			return n.data;
		}

	}

	public void reversedataiterativly() throws Exception {

		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getnodeat(left);
			Node rn = getnodeat(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public void reversepointersiterativly() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;

			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
		// swapping head and tail

		Node t = this.head;
		this.head = this.tail;
		this.tail = t;

		tail.next = null;
	}

	public int mid() {

		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;

	}

	public void reversePointerRecursively() {
		reversePointerRecursively(null, head);

		// swap head and tail
		Node temp = head;
		head = tail;
		tail = temp;
	}

	private void reversePointerRecursively(Node prev, Node curr) {

		if (curr == null) {
			return;
		}

		Node ahead = curr.next;
		curr.next = prev;
		reversePointerRecursively(curr, ahead);

	}

	private class HeapMover {
		Node left;
	}

	public void reverseDataRecursively() {

//		HeapMover mover = new HeapMover();
//		mover.left = head;
//
//		reverseDataRecursively(mover, head, 0);

		System.out.println(reverseDataRecursively(head, head, 0));
	}

	private void reverseDataRecursively(HeapMover mover, Node right, int count) {

		if (right == null) {
			return;
		}

		reverseDataRecursively(mover, right.next, count + 1);

		// swap the data of left and right node
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}

		mover.left = mover.left.next;

	}

	private Node reverseDataRecursively(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		Node cl = reverseDataRecursively(left, right.next, count + 1);

		// swap the data of left and right node
		if (count >= size / 2) {
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;
		}

		return cl.next;

	}

	public void fold() {
		HeapMover mover = new HeapMover();
		mover.left = head;
		fold(mover, head, 0);
	}

	private void fold(HeapMover mover, Node right, int count) {

		if (right == null) {
			return;
		}

		fold(mover, right.next, count + 1);

		// make links
		if (count > size / 2) {

			Node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;

			// mover update
			mover.left = ahead;

		}

		if (count == size / 2) {
			tail = right;
			tail.next = null;
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

	public void Kreverse(int k) {
		head = Kreverse(head, k);
	}

	public Node Kreverse(Node node, int k) {

		// base case
		if (node == null) {
			return null;
		}
		// to identify the argument of smaller problem
		Node temp = node;
		for (int i = 1; i <= k && temp != null; i++) { // temp condition isliye di taki agar linkedlist k ke multiple
														// bhi nah ho tb bhi chl jae
			temp = temp.next;
		}

		/// smaller problem : s2 and s3 reverse
		Node prev = Kreverse(temp, k);

		// self work
		// logic used : Reverse pointer iterativly
		// only difference is prev ko NULL se shuru nah krke usse kra jo naya head h
		Node curr = node;

		while (curr != temp) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}
		return prev; // yeh naya head hoga
	}

	public void createDummyList() {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);
		Node n10 = new Node(100);
		Node n11 = new Node(110);
		Node n12 = new Node(120);
		Node n13 = new Node(130);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n13.next = n12;
		n12.next = n11;
		n11.next = n7;

		Node h1 = n1;
		Node h2 = n13;

		// logic ....
		intersection(h1, h2);

	}

	// O(m+n)
	public void intersection(Node h1, Node h2) {

		Node fp = h1;
		Node sp = h2;

		while (fp != sp) {

			if (fp == null)
				fp = h2;
			else
				fp = fp.next;

			if (sp == null)
				sp = h1;
			else
				sp = sp.next;

		}
		System.out.println(fp.data);
	}

	public void createDummyList1() {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;

		// logic ....
		System.out.println(detectloop(n1));

	}

	public boolean detectloop(Node h1) { // FLOYD CYCLE DETECTION ALGORITHM
		Node slow = h1;
		Node fast = h1;
		while (fast != null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
//				removeloop(slow, h1);
				removeloop1(slow, h1);
				return true;
			}
		}
		return false;

	}

	public void removeloop(Node meet, Node h) {
		/// no of nodes in loop
		int cnt = 1;
		Node temp = meet;
		while (temp.next != meet) {
			cnt++;
			temp = temp.next;
		}

		// move a pointer count no of steps
		Node fast = h;
		for (int i = 1; i <= cnt; i++) {
			fast = fast.next;
		}

		// make slow and fast move at same speed
		Node slow = h;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
//
//		// print all
//		Node t = h;
//		while (t != null) {
//			System.out.print(t.data + " ");
//			t = t.next;
//		}
//		System.out.println();

	}

	public void removeloop1(Node meet, Node h) {
		Node start = h;
		Node loop = meet;

		while (start.next != loop.next) {
			loop = loop.next;
			start = start.next;
		}
		loop.next = null;
	}

	public void oddevenExtraSpace() {

		linkedlist odd = new linkedlist();
		linkedlist even = new linkedlist();

		Node temp = this.head;
		while (temp != null) {

			if (temp.data % 2 == 0) {
				even.addlast(temp.data);
			} else {
				odd.addlast(temp.data);
			}

			temp = temp.next;
		}

		if (even.size == 0) {

			this.head = odd.head;
			this.tail = odd.tail;
			this.size = odd.size;

		} else if (odd.size == 0) {

			this.head = even.head;
			this.tail = even.tail;
			this.size = even.size;

		} else {

			odd.tail.next = even.head;
			this.head = odd.head;
			this.tail = even.tail;
			this.size = odd.size + even.size;

		}

	}

	public void oddeven() {

		// odd head
		Node ohead = null;

		// even head
		Node ehead = null;

		// otemp : last node of odd ll
		Node otemp = null;
		Node etemp = null;

		Node temp = head;

		while (temp != null) {

			if (temp.data % 2 == 0) {

				if (ehead == null) {
					ehead = temp;
					etemp = temp;
				} else {

					etemp.next = temp;
					etemp = temp;

				}

			} else {

				if (ohead == null) {
					ohead = temp;
					otemp = temp;
				} else {

					otemp.next = temp;
					otemp = temp;

				}

			}

			temp = temp.next;
		}

		etemp.next = null;
		otemp.next = null;

		if (ehead == null) {

			this.head = ohead;
			this.tail = otemp;

		} else if (ohead == null) {

			this.head = ehead;
			this.tail = etemp;

		} else {

			otemp.next = ehead;

			this.head = ohead;
			this.tail = etemp;
		}

	}

	public linkedlist mergeTwoSortedLL(linkedlist other) {

		linkedlist sorted = new linkedlist();

		Node one = this.head;
		Node two = other.head;

		while (one != null && two != null) {

			if (one.data < two.data) {
				sorted.addlast(one.data);
				one = one.next;
			} else {
				sorted.addlast(two.data);
				two = two.next;
			}

		}

		if (one == null) {

			while (two != null) {
				sorted.addlast(two.data);
				two = two.next;
			}
		}

		if (two == null) {

			while (one != null) {
				sorted.addlast(one.data);
				one = one.next;
			}
		}

		return sorted;

	}

}
