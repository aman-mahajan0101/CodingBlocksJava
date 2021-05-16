package Lec3;

import java.util.Scanner;

public class temp {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
		int mint = scn.nextInt();
		int maxt = scn.nextInt();
	int step = scn.nextInt();
	for(int temp=mint;temp<=maxt;temp=temp+step)
	{
		int c = (int)(5.0/9*(temp-32));
		
		System.out.println(temp+ "\t"+ c);
	}
}
}
