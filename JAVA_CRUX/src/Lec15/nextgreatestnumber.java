package Lec15;

public class nextgreatestnumber {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10, 60, 70, 80, 90 };
		nre(arr);
	}

	public static void nre(int[] arr) {
		java.util.Stack<Integer> s = new java.util.Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + " -> " + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + " -> " + "-1");
		}
	}

}