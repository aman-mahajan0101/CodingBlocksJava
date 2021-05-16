package LinkedList;

import java.util.*;

class Main {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void merge_sorted_list(Main other) throws Exception {

		Main dis = merge_sorted_list1(other);
		dis.display();
	}

	public Main merge_sorted_list1(Main other) throws Exception {

		Main sorted = new Main();

		Node one = this.head;
		Node two = other.head;

		while (one != null && two != null) {

			if (one.data < two.data) {
				sorted.addLast(one.data);
				one = one.next;
			} else {
				sorted.addLast(two.data);
				two = two.next;
			}

		}

		if (one == null) {

			while (two != null) {
				sorted.addLast(two.data);
				two = two.next;
			}
		}

		if (two == null) {

			while (one != null) {
				sorted.addLast(one.data);
				one = one.next;
			}
		}

		return sorted;

	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		int t = scn.nextInt();

		while (t > 0) {

			Main list1 = new Main();
			int n1 = scn.nextInt();

			for (int j = 0; j < n1; j++) {
				int item = scn.nextInt();
				list1.addLast(item);
			}

			Main list2 = new Main();
			int n2 = scn.nextInt();

			for (int j = 0; j < n2; j++) {
				int item = scn.nextInt();
				list2.addLast(item);
			}
			//list1.merge_sorted_list(list2).display();

			list1.merge_sorted_list(list2);
			t--;
		}

	}
}
