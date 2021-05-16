package Queue;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isfull()) {

			// create new array

			int[] na = new int[2 * data.length];

			// copy the older elements
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % data.length;
				na[i] = data[idx];

			}

			// reference change
			data = na;
			front = 0;
		}

		super.enqueue(item);
	}
}
