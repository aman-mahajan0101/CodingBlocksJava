package SegmentTree;

public class segtreeclient {
	public static void main(String[] args) {
		int[] arr = { 3, 8, 7, 6, -2, -8, 4, 9 };
		segmenttree tree = new segmenttree(arr);
		tree.display();

		System.out.println("_________________");

		System.out.println("sum is " + tree.query(2, 6));
		System.out.println("sum is " + tree.query(4, 5));

		System.out.println("_________________");

		tree.update(3, 14);
		tree.display();
		
		System.out.println(tree.query(2, 6));
	}
}
