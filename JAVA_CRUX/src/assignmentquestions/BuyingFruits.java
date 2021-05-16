package assignmentquestions;
import java.util.*;
public class BuyingFruits {
    public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int k=0;k<t;k++){

            int n=scan.nextInt();

            Long[][] arr=new Long[n][3];
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++)
                    arr[i][j]=scan.nextLong();
            }

            Long res= shops(0,arr,4,new Long[1000000][3]);
            System.out.println(res);
        }

    }

    public static Long shops(int idx,Long[][] arr,int j,Long[][] strg){

        if(idx==arr.length)
            return (long)0;
        
        if(j<3 && strg[idx][j] != null)
            return strg[idx][j];
           Long min=Long.MAX_VALUE;

        for(int i=0;i<3;i++){
            if(i==j)
                continue;
            
            Long res=shops(idx+1,arr,i,strg)+arr[idx][i];
            min=Math.min(res,min);

        }
        if(j<3)
            strg[idx][j] =min;
        return  min;

    }

}
