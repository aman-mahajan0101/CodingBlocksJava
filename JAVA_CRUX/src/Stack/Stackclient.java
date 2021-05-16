package Stack;

public class Stackclient {

	public static void main(String[] args) throws Exception {
		stack s = new stack();
		s.push(60);
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
		s.display();
		s.push(10);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
