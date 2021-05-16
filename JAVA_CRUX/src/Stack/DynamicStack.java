package Stack;

public class DynamicStack extends stack {

	@Override
	public void push(int item) throws Exception {

		if (isfull()) {

			// create new array
			int[] na = new int[2 * data.length];

			// copy older elements
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}

			// reference change
			data = na;

		}

		super.push(item);
	}

}
