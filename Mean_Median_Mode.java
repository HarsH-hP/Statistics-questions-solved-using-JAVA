import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X[]=new int[N];
        float mean=0;
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
            mean=mean+X[i];
        }
        mean=mean/N;
        DecimalFormat df=new DecimalFormat("0.0");
        System.out.println(df.format(mean));
        Arrays.sort(X);
        if(X.length%2==0){
            float median=(float)(X[(X.length/2)-1]+X[(X.length/2)])/2;
            System.out.println(df.format(median));
        }
        else{
            float median=X[(X.length/2)-1];
            System.out.println(df.format(median));
        }

        int array_value_count=0,mode_count=0,mode=0;
        for(int i=0;i<X.length-1;i++){
            array_value_count++;
            for(int j=i+1;j<X.length;j++){
                if(X[i]==X[j]){
                    array_value_count++;
                }
            }
            if(array_value_count>mode_count){
                mode_count=array_value_count;
                mode=X[i];
            }
            array_value_count=0;
        }
        System.out.println(mode);
    }
}
