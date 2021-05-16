package assignmentquestions;
import java.util.*;

public class NextGreaterElement {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
		  Stack<Integer> st = new Stack<>();

        // The answer array to store the next Greater element
        int[] narr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // Pop till we get the greater element on top or the stack gets empty
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                narr[st.pop()] = arr[i];
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            narr[st.pop()] = -1;
        }

        // Print as per the required format
        for (int i = 0; i < narr.length; i++) {
            System.out.println(arr[i] + "," + narr[i]);
        }       

	}
}//NextGreater
