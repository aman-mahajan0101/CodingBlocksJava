package Lec11;

public class Cointossprintrecursionwithnoconshead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cointoss(3, "");
		System.out.println();
		cointoss1(3, "");
		System.out.println();
		cointoss2(3, "", false);
	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length() != 0 && ans.charAt(ans.length() - 1) == 'H') {
			cointoss(n - 1, ans + "T");
		} else {
			cointoss(n - 1, ans + "H");
			cointoss(n - 1, ans + "T");
		}
	}

	public static void cointoss1(int n, String ans) {
		if (n == 0) {
			if (ans.indexOf("HH") == -1)
				System.out.print(ans + " ");
			return;
		}

		cointoss1(n - 1, ans + "H");
		cointoss1(n - 1, ans + "T");
	}

	public static void cointoss2(int n, String ans, boolean bool) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (bool) {
			cointoss2(n - 1, ans + "T", false);
		} else {
			cointoss2(n - 1, ans + "H", true);
			cointoss2(n - 1, ans + "T", false);
		}
	}
}
