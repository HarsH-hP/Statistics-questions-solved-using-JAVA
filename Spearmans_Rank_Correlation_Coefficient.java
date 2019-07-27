import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=0,count=0;
        do{
            n=sc.nextInt();
        }while(!(n>=10)&&!(n<=100));
        float []X=new float[n];
        float []Y=new float[n];
        for(int i=0;i<n;i++){
                do{
                    count=0;
                    for(int j=0;j<i;j++){
                        if(X[i]==X[j]){
                            count++;
                        }    
                    }
                    if(count==0){
                        X[i]=sc.nextFloat();
                    }
                    else{
                        X[i]=0;
                    }
                
            }while(!(X[i]>=1)&&!(X[i]<=500));
            
        }
        
        for(int i=0;i<n;i++){
                do{
                    count=0;
                    for(int j=0;j<i;j++){
                        if(Y[i]==Y[j]){
                            count++;
                        }    
                    }
                    if(count==0){
                        Y[i]=sc.nextFloat();
                    }
                    else{
                        Y[i]=0;
                    }
                
            }while(!(Y[i]>=1)&&!(Y[i]<=500));
            
        }
        int county;
        float sumdi=0;
        float []di=new float[n];
        for(int i=0;i<n;i++){
            count=1;county=1;
            for(int j=0;j<n;j++){
                if(X[i]>X[j]){
                    count++;
                }
                if(Y[i]>Y[j]){
                    county++;
                }
            }
            di[i]=(count-county)*(count-county);
            sumdi+=di[i];
        }
        double rank=0;
        rank=1-((6*sumdi)/(n*((n*n)-1)));
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(rank));


    }
}

