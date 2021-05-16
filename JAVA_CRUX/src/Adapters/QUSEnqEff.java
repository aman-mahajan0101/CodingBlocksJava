package Adapters;

import Stack.DynamicStack;

public class QUSEnqEff {

	DynamicStack ps = new DynamicStack();

	//O(1)
	public void enqueue(int item) throws Exception {
		try {
			ps.push(item);
		} catch (Exception e) {
			throw new Exception("Queue is Full");
		}
	}

	//O(n)
	public int dequeue() throws Exception {
		try {
			DynamicStack hs = new DynamicStack();
			while (ps.size() != 1) {
				hs.push(ps.pop());
			}
			int temp = ps.pop();

			while (hs.size() != 0) {
				ps.push(hs.pop());
			}

			return temp;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	//O(n)
	public int getfront() throws Exception {
		try {
			DynamicStack hs = new DynamicStack();
			while (ps.size() != 1) {
				hs.push(ps.pop());
			}
			int temp = ps.pop();
			hs.push(temp);
			while (hs.size() != 0) {
				ps.push(hs.pop());
			}

			return temp;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	//O(1)
	public int size() {
		return ps.size();
	}

	//O(1)
	public boolean IsEmpty() {
		return ps.isempty();
	}

	//O(1)
	public boolean IsFull() {
		return ps.isfull();
	}

	public void display() throws Exception {
		displayH();
	}

	private void displayH() throws Exception {
		try {
			if (ps.isempty()) {
				return;
			}
			int temp = ps.pop();
			displayH();
			System.out.println(temp);
			ps.push(temp);
		} catch (Exception e) {
			throw new Exception("Error in Display");
		}
	}
}
