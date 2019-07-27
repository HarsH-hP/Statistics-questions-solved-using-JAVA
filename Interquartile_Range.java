import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int q=0;
        do{
            q=sc.nextInt();
        }while( (q>=5) && !(q<=50) );
        int []x=new int[q];
        for(int i=0;i<x.length;i++){
            do{
                x[i]=sc.nextInt();
            }while( !(x[i]>0) && !(x[i]<=100) );
        }
        int []F=new int[q];
        int sumcheck=0;
        for(int i=0;i<F.length;i++){
            do{
                F[i]=sc.nextInt();
                sumcheck+=F[i];
            }while(!(sumcheck>0) && !(sumcheck<=1000));
        }
        int []X=new int[sumcheck];
        int p=0;
        for(int i=0;i<q;i++){
            for(int j=0;j<F[i];j++){
                X[p]=x[i];
                p++;
            }
        }
        Arrays.sort(X);
        float q1=0,q2=0,q3=0;
        int mid=sumcheck/2;
        int lmid=(mid-1)/2;
        int umid=(mid+sumcheck-1)/2;
        if(sumcheck%2==0){
            q2=(float)((X[mid]+X[mid-1])/2);
                // int total_lower=mid-1;
                if((mid-1)%2!=0){
                    q1=(float)((X[lmid]+X[lmid+1])/2);
                }
                else{
                    q1=(float)(X[lmid]);
                }
            // int total_upper=sumcheck-mid;
            if((sumcheck-mid)%2==0){
                q3=(float)((X[umid]+X[umid+1])/2);
            }
            else{
                q3=(float)(X[umid]);
            }
        }
        else{
            q2=(float)(X[mid]);
                //total_lower=mid-1;
                if((mid-1)%2!=0){
                    q1=(float)((X[lmid]+X[lmid+1])/2);
                }
                else{
                    q1=(float)(X[lmid]);
                }
            //total_upper=sumcheck-(mid+1);
            if((sumcheck-(mid+1))%2==0){
                q3=(float)((X[umid]+X[umid+1])/2);
            }
            else{
                umid=(sumcheck+mid)/2;
                q3=(float)(X[umid]);
            }    
        }
        DecimalFormat df=new DecimalFormat("0.0");
        float iqr=q3-q1;
        System.out.println(df.format(iqr));
       
    }
}

