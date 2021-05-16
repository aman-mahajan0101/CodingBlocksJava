package Adapters;

public class QUSEnqEffClient {
	public static void main(String[] args) throws Exception {
		QUSEnqEff queue = new QUSEnqEff();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.getfront());
	}

}
