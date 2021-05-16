package assignmentquestions;

import java.util.*;
public class CountBinaryStrings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            System.out.println(count(n));
            t--;
        }
    }

    public static int count(long n){
        long[] a = new long[(int) n];
        long[] b = new long[(int) n];
        a[0]=b[0]=1;
        for (int i = 1; i < n; i++){
        a[i] = (long)(a[i-1] + b[i-1]);
        b[i] = (long)a[i-1];
        }
    return (int)(a[(int)n-1] + b[(int)n-1]);
    }
}