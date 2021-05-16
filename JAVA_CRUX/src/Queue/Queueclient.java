package Queue;

public class Queueclient {

	public static void main(String[] args) throws Exception {
		Queue s = new Queue();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		s.enqueue(50);
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());

		s.enqueue(60);
		s.enqueue(70);
		s.display();

	}

}
