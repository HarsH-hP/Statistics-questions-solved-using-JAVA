import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int N=0;
        do{
            N=sc.nextInt();
        }while( !(N>=5) && !(N<=100) );
        int []X=new int[N];
        float mean=0;
        for(int i=0;i<N;i++){
            do{
                X[i]=sc.nextInt();
            }while( !(X[i]>0) && !(X[i]<=100000));
            mean=mean+X[i];
        }
        mean=(float)mean/N;
        DecimalFormat df=new DecimalFormat("0.0");
        float sd=0;
        for(int i=0;i<N;i++){
            sd=sd+((X[i]-mean)*(X[i]-mean));
        }
        sd=sd/N;
        System.out.println(df.format(Math.sqrt(sd)));
    }
}

