package assignmentquestions;

import java.util.Scanner;

public class evenoddcharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// TODO Auto-generated method stub
		String str = scn.next();
		//System.out.println(change(str));
	}

	public static void change(String str) {
		//int cnt=0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
			//	str.charAt(i)= (char) str.charAt(i) + 1;
			}
		}
		//return cnt;
	}

}
