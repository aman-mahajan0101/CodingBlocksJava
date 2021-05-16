package Intefaceandgenerics;

public class ClientForClassGeneric {

	public static void main(String[] args) {
		Pair<String> pair = new Pair<>();
		pair.one = "abc";
		pair.two = "def";
		Pair<Integer> pair1 = new Pair<>();
		pair1.one = 10;
		pair1.two = 20;

		PairTwo<Integer, String> pair2 = new PairTwo<>();
		pair2.one = 10;
		pair2.two = "xyz";

		linkedlistGeneric<Car> list = new linkedlistGeneric<>();

		Car[] cars = new Car[5];
		cars[0] = new Car(100, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Blue");
		cars[3] = new Car(300, 30, "Green");
		cars[4] = new Car(700, 60, "White");

		list.addlast(cars[0]);
		list.addlast(cars[1]);
		list.addlast(cars[2]);
		list.addlast(cars[3]);
		list.addlast(cars[4]);
		list.display();
	}

}
