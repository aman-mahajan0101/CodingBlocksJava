package LinkedList;

import java.util.LinkedList;

public class Client {

	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		// list.addfirst(40);
		// list.addfirst(50);
		list.display();
//		try {
//			System.out.println(list.getfirst());
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			System.out.println(list.getlast());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			System.out.println(list.getat(2));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		System.out.println("--------------------");
//		try {
//			list.addAt(100, 3);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		list.display();
//		try {
//			System.out.println(list.removefirst());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			System.out.println(list.removelast());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		list.display();
//		System.out.println("--------.............-------------");
//		try {
//			System.out.println(list.removeat(2));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		list.display();
//		try {
//			list.reversedataiterativly();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		list.display();
//		list.reversepointersiterativly();
//		list.display();
//		list.addfirst(60);
//		list.display();
//		System.out.println(list.mid());
//		list.addlast(30);
//		list.display();
//		list.Kreverse(3);
//		list.display();
//		list.addlast(90);
//		list.display();
//		list.Kreverse(3);
//		list.display();
//
//		list.createDummyList(); // works on another linked list dont work on the above linkedlist
//		list.createDummyList1();

		linkedlist list1 = new linkedlist();

		list1.addlast(5);
		list1.addlast(7);
		list1.addlast(45);

		// list.oddeven();
		list.mergeTwoSortedLL(list1).display();
	}

}
