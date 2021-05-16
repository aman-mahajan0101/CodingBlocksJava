package Lec11;

public class Cointossprintrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cointoss(3, "");
	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		cointoss(n-1, ans+"H"); 
		cointoss(n-1, ans+"T");

	}

}
