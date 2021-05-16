package Queue;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		data = new int[5];
		front = size = 0;
	}

	public Queue(int cap) {
		data = new int[cap];
		front = size = 0;
	}

	public void enqueue(int item) throws Exception {

		if (isfull()) {
			throw new Exception("Queue is full.");
		}

		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("Queue is empty");
		}
		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;
		return temp;
	}

	public int getfront() throws Exception {
		if (isempty()) {
			throw new Exception("Queue is empty");
		}
		int temp = data[front];
		return temp;
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == data.length;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}
}
