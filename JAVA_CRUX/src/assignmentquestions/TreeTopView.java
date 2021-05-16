package assignmentquestions;
import java.util.*;
public class TreeTopView {
   public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;
			StringBuilder sb = new StringBuilder();
			char ch = str.charAt(i);
			sb.append(ch);
			int j = i + 1;
			while (j < str.length() && str.charAt(j) != ' ') {
				sb.append(str.charAt(j));
				j++;
			}
			list.add(Integer.parseInt(sb.toString()));
			i = j;
		}
		Top(list, 0, true);
	}

	public static void Top(ArrayList<Integer> list, int index, boolean lt) {
		if (index >= list.size())
			return;
		if (list.get(index) == -1)
			return;
		if (lt) {
			Top(list, 2 * index + 1, true);
			System.out.print(list.get(index) + " ");
		}
		if (index == 0) {
			index = 2 * index + 2;
			lt = false;
		}
		if (index < list.size() && !lt) {
			if (list.get(index) != -1)
				System.out.print(list.get(index) + " ");
			Top(list, 2 * index + 2, false);
		}

	}
}
