package assignmentquestions;

import java.util.*;
public class TreeBottomView {
	
	static Scanner scn = new Scanner(System.in);
	class Node {
		int data;
		Node left;
		Node right;
		
	}
	Node root;
	public TreeBottomView() {
		this.root = construct(null);
	}
	private Node construct(Node node) {
		int x = scn.nextInt();
		Node nn = new Node();
		nn.data = x;
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(nn);
		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			int l = scn.nextInt();
			int r = scn.nextInt();
			if (l != -1) {
				Node n = new Node();
				n.data = l;
				temp.left = n;
				queue.addLast(n);
			}
			if (r != -1) {
				Node n = new Node();
				n.data = r;
				temp.right = n;
				queue.addLast(n);

			}

		}
		return nn;

	}
	class helper{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
	}
	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node == null)
			return;
		String str = "";
		if (node.left == null)
			str = str + ".";
		else
			str = str + node.left.data;
		str = str + "->" + node.data + "<-";

		if (node.right == null)
			str = str + ".";
		else
			str = str + node.right.data;
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public void finddist(helper ht)
	{
		
		finddist(this.root, ht, 0);
		//System.out.println(ht.max+" "+ht.min);
	}
	private void finddist(Node node,helper ht,int c)
	{
		if(node==null)
			return;
		if(ht.min>c)
			ht.min=c;
		if(ht.max<c)
			ht.max=c;
		
		finddist(node.left, ht,c-1);
		finddist(node.right, ht,c+1);
	}
	public void fun()
	{
		helper ht=new helper();
		fun(this.root,ht);
	}
	private void fun(Node node,helper ht)
	{
		finddist(ht);
		
		for(int i=ht.min;i<=ht.max;i++)
		{
			fun1(node,i,0);
		}
	}
	 static TreeMap<Integer,Integer> map=new TreeMap<>();
	public void fun1(Node node,int target,int c)
	{
		if(node==null)
			return;
		if(c==target)
		{
			if(map.containsKey(c))
			{
				map.put(c,node.data);
			}
			else
			{
				map.put(c,node.data);
			}
		}
		
		fun1(node.left, target, c-1);
		fun1(node.right, target, c+1);
		
	}
	public static void main(String[] args) {
		TreeBottomView obj=new TreeBottomView();
		//obj.finddist();
		//obj.display();
		obj.fun();
		Collection<Integer> res=map.values();
		for(int val:res)
			System.out.print(val+" ");
		
	}

}
