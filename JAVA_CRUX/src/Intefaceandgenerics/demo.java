package Intefaceandgenerics;

import java.util.Comparator;

public class demo {
	public static void main(String[] args) {
		Integer[] arri = { 10, 20, 30, 40, 50 };
		display(arri);
		String[] arrs = { "hello", "india", "delhi" };
		display(arrs);

		Car[] cars = new Car[5];
		cars[0] = new Car(100, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Blue");
		cars[3] = new Car(300, 30, "Green");
		cars[4] = new Car(700, 60, "White");

		display(cars);
		// bubblesort(cars);
		bubblesort1(cars, new CarSpeedComparator());
		display(cars);
		bubblesort1(cars, new CarpriceComparator());
		display(cars);
		bubblesort1(cars, new CarColorComparator());
		display(cars);
	}

//   public static void display(Integer[] arr) {
//		for (Integer val : arr) {
//			System.out.println(val + " ");
//		}
//		System.out.println();
//	}
//
//	public static void display(String[] arr) {
//		for (String val : arr) {
//			System.out.println(val + " ");
//		}
//		System.out.println();
//	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

	// bubble sort when we use implement comparable
	public static <T extends Comparable<T>> void bubblesort(T[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					T temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

//  bubble sort when we use comparator
	public static <T> void bubblesort1(T[] a, Comparator<T> comparator) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (comparator.compare(a[j], a[j + 1]) > 0) {
					T temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
