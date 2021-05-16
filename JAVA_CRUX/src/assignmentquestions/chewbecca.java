package assignmentquestions;

import java.util.Scanner;

public class chewbecca {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    long n = scn.nextLong();
    int cnt = 0 ;
    long result = 0;
    long temp = n;
    int ds =0;
    while(temp>0)
    {
        temp = temp / 10;
        ds++;
    }

    while(n>0)
    {
        long rem = n % 10;
        if(ds == cnt+1 && rem ==9)
           {
               result = result + 9*(long)Math.pow(10,cnt);
           }
        else if(rem > 9 - rem)
        {
            result = result + (9-rem)*(long)Math.pow(10,cnt);
        }   
        else
        {
            result = result + rem * (long)Math.pow(10,cnt);
        }
         n = n / 10;
         cnt++;
    }
    System.out.println(result);
}
}
