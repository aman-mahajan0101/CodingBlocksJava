package Queue;

public class DQclient {
	public static void main(String[] args) throws Exception {

		Queue dq = new DynamicQueue();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);

		dq.display();
		System.out.println("-------------------");
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		System.out.println("-------------------");
		dq.display();
		System.out.println("-------------------");
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(90);
		System.out.println("-------------------");
		dq.display();
		System.out.println("-------------------");
		actualreverse(dq);
		System.out.println("-------------------");
		displayreverse(dq, 0);
		System.out.println("-------------------");
		dq.display();
		System.out.println("-------------------");

	}

	public static void displayreverse(Queue q, int cnt) throws Exception {
		if (q.size == cnt) {
			return;
		}
		int t = q.dequeue();
		q.enqueue(t);
		displayreverse(q, cnt + 1);
		System.out.println(t);

	}

	public static void actualreverse(Queue q) throws Exception {

		if (q.isempty()) {
			return;
		}
		int t = q.dequeue();
		actualreverse(q);
		q.enqueue(t);

	}
	
	
	
}
