import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
        
        //Mean of X Y 
        float meanX=0,meanY=0;
        for(int i=0;i<n;i++){
            meanX+=X[i];
            meanY+=Y[i];
        }
        meanX=(float)meanX/n;
        meanY=(float)meanY/n;

        //SD of X Y
        double sdX=0,sdY=0,midcal=0;
        for(int i=0;i<n;i++){
            sdX+=Math.pow((X[i]-meanX),2);
            sdY+=Math.pow((Y[i]-meanY),2);
            midcal+=((X[i]-meanX)*(Y[i]-meanY));
        }
        sdX=Math.sqrt((sdX/n));
        sdY=Math.sqrt((sdY/n));
        double pearson_co=(double)midcal/(n*sdX*sdY);
        DecimalFormat df=new DecimalFormat("0.000");
        
        System.out.println(df.format(pearson_co));
    }
}

