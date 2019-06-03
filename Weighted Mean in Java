import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int total_num=0;
        do{
            total_num=sc.nextInt();
        }while(!(total_num>=5) && !(total_num<=50) );
        int []X=new int[total_num];
        int []W=new int[total_num];
        for(int i=0;i<X.length;i++){
            do{
                X[i]=sc.nextInt();
            }while(!(X[i]>0) && !(X[i]<=100));
        }
        for(int i=0;i<W.length;i++){
            do{
                W[i]=sc.nextInt();
            }while(!(W[i]>0) && !(W[i]<=100));
        }
        float mean=0;
        int total_weight=0;
        for(int i=0;i<total_num;i++){
            mean=mean+(X[i]*W[i]);
            total_weight=total_weight+W[i];
        }
        DecimalFormat df=new DecimalFormat("0.0");
        mean=(float)mean/total_weight;
        System.out.println(df.format(mean));
    }
}

