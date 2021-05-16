package Adapters;

import Queue.DynamicQueue;

public class SUQPushEff {

	DynamicQueue pq = new DynamicQueue();

	// O(1)
	public void push(int item) throws Exception {
		try {
			pq.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is full");
		}
	}

	// O(n)
	public int pop() throws Exception {

		try {
			DynamicQueue hq = new DynamicQueue();
			while (pq.size() != 1) {
				hq.enqueue(pq.dequeue());
			}
			int temp = pq.dequeue();

			pq = hq;

			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is empty");
		}
	}

	// O(n)
	public int peek() throws Exception {

		try {
			DynamicQueue hq = new DynamicQueue();
			while (pq.size() != 1) {
				hq.enqueue(pq.dequeue());
			}
			int temp = pq.dequeue();
			hq.enqueue(temp);

			pq = hq;

			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is empty");
		}
	}

	// O(1)
	public int size() {
		return pq.size();
	}

	// O(1)
	public boolean IsEmpty() {
		return pq.isempty();
	}

	// O(1)
	public boolean isFull() {
		return pq.isfull();
	}

	public void display() throws Exception {
		System.out.println(" ---------------------------");
		display(0);
		System.out.println(" ---------------------------");
	}

	private void display(int count) throws Exception {
		try {
			if (count == pq.size()) {
				return;
			}
			int temp = pq.dequeue();

			pq.enqueue(temp); // to maintain the queue order

			display(count + 1);

			System.out.println(temp); // print
		} catch (Exception e) {
			throw new Exception("Error in Display");
		}

	}
}
