package Adapters;

public class QUSDeqEffClient {
	public static void main(String[] args) throws Exception {
		QUSDeqEff queue = new QUSDeqEff();
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
