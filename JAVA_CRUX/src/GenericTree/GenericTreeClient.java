package GenericTree;

public class GenericTreeClient {

	// 10 3 20 2 50 0 60 1 80 0 30 0 40 1 70 0
	public static void main(String[] args) {

		generictree gt = new generictree();
		gt.display();

		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.ht());
		System.out.println(gt.find(60));

//		gt.mirror();
//		gt.display();
//		gt.printAtLevel(4);
		// gt.linearize();
//		 gt.display();
//		 gt.display2();
//		 gt.levelorder();
//		 gt.levelorderLW1();
//		 gt.levelorderLW2();

		gt.levelorderZZ();
	}
}