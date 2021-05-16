package Lec3;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		int a;
		
		a = (int)ch;
		
		if(a>=(int)'a' && a<=(int)'z')
			System.out.println("Lowercase");
		else if(a>=(int)'A' && a<=(int)'Z')
			System.out.println("Üppercase");
		else
			System.out.println("Invalid");
		
	}

}
