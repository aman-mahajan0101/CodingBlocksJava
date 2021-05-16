package Binarytree;

public class BTclient {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 60
	// false false
	// 10 true 20 true 40 true 70 true 90 true 110 false false false false false
	// true 50 false true 80 false true 100 false true 120 false false true 30 false
	// true 60 false false
	// 10 true 20 true 40 true 2 false false true 3 false false true -60 false false
	// true -30 true 50 true 60 true 80 false false false true 70 false false true
	// -100 false false
	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 30, 50, 60, 70 };
		int[] in = { 40, 20, 10, 50, 30, 60, 70 };
		BinaryTree bt = new BinaryTree(pre, in);
		// bt.display();
		// BinaryTree bt = new BinaryTree();
		// System.out.println(bt.size());
		// System.out.println(bt.max());
		// System.out.println(bt.find(30));
		// System.out.println(bt.ht());
		//
		// System.out.println(bt.diameter());
		// System.out.println(bt.diameter2());
		// System.out.println(bt.diameter3());
		//
		// System.out.println(bt.isBalanced2());
		// System.out.println(bt.isBalanced3());

		// BinaryTree bt2 = new BinaryTree() ;
		//
		// bt.flipEquivalent(bt2) ;

		// bt.preoderI();

//		 System.out.println(bt.maxSubtreeSum1());
//		 System.out.println(bt.maxSubtreeSum2());
//		 System.out.println(bt.maxSubtreeSum3());

//		System.out.println(bt.istreebst());
//		System.out.println();
//		bt.isTreeBST1();

		bt.verticalOrderDisplay();
		bt.printTillK(30, 2);

	}

}
