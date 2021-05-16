package Stack;

public class stack {

	protected int[] data;
	protected int tos;

	public stack() {
		data = new int[5];
		tos = -1;
	}

	public stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {

		if (isfull()) {
			throw new Exception("Stack is full.");
		}

		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is Empty.");
		}

		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() throws Exception {
		if (isempty()) {
			throw new Exception("Stack is Empty.");
		}

		int temp = data[tos];
		return temp;
	}

	public int size() {
		return tos + 1;
	}

	public boolean isempty() {
		return size() == 0;
	}

	public boolean isfull() {
		return size() == data.length;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

//	public int getmin() {
//		int min;
//		
//		return min;
//	}
}
