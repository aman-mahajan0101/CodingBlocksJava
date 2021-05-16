package Intefaceandgenerics;

public class linkedlistGeneric<T> {

	private class Node {
		private T data;
		private Node next;

		public Node(T data) {
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
		System.out.println("---------------------------------------------------------------------------------------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;

		}
		System.out.println(".");
		System.out.println("---------------------------------------------------------------------------------------------------------");

	}

	// O(1)
	public void addlast(T item) {
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
	public void addfirst(T item) {
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
	public T getfirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		return this.head.data;
	}

	// O(1)
	public T getlast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		return this.tail.data;
	}

	// O(n)
	public T getat(int idx) throws Exception {

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
	public void addAt(T item, int idx) throws Exception {

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
	public T removefirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		T rv = this.head.data;
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
	public T removelast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}

		T rv = this.tail.data;
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
	public T removeat(int idx) throws Exception {

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

}
