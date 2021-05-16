package assignmentquestions;

import java.util.Scanner;
import java.util.Stack;

public class StackSpan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] span = new int[arr.length];

		sc.close();

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}

			s.push(i);

		}

		for (int val : span) {
			System.out.print(val + " ");
		}
		System.out.print("END");
	}

}