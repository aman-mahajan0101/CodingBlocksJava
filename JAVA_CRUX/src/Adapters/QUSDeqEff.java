package Adapters;

import Stack.DynamicStack;

public class QUSDeqEff {

	DynamicStack ps = new DynamicStack();

	// O(n)
	public void enqueue(int item) throws Exception {
		try {
			DynamicStack hs = new DynamicStack();

			while (ps.size() != 0) {
				hs.push(ps.pop());
			}
			hs.push(item);

			while (hs.size() != 0) {
				ps.push(hs.pop());
			}
		} catch (Exception e) {
			throw new Exception("Queue is full");
		}
	}

	// O(1)
	public int dequeue() throws Exception {
		try {
			return ps.pop();
		} catch (Exception e) {
			throw new Exception("Queue is empty");
		}
	}

	// O(1)
	public int getfront() throws Exception {
		try {
			return ps.peek();
		} catch (Exception e) {
			throw new Exception("Queue is empty");
		}
	}

	// O(1)
	public int size() {
		return ps.size();
	}

	// O(1)
	public boolean IsEmpty() {
		return ps.isempty();
	}

	// O(1)
	public boolean IsFull() {
		return ps.isfull();
	}

	// O(n)
	public void display() {
		ps.display();
	}
}
