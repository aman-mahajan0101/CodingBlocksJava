package Stack;

public class DSclient {
	public static void main(String[] args) throws Exception {

		stack ds = new DynamicStack();

		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);

//		ds.display();
//		System.out.println(ds.pop());
//		System.out.println(ds.pop());
//
//		ds.push(80);
//		ds.push(90);
		// ds.display();
//
//		System.out.println("--------------");
//		displayreverse(ds);
		ds.display();
		actualreverse(ds, new DynamicStack());
		ds.display();
	}

	public static void displayreverse(stack s) throws Exception {
		// base case
		if (s.isempty()) {
			return;
		}

		int a = s.pop();
		displayreverse(s);
		System.out.println(a);
		s.push(a);
	}

	public static void actualreverse(stack s, stack other) throws Exception {

		// base case
		if (s.isempty()) {

			if (other.isempty()) {
				return;
			}
			int t = other.pop();

			actualreverse(s, other);
			s.push(t);

			return;
		}

		int temp = s.pop();
		other.push(temp);
		actualreverse(s, other);
	}

}
