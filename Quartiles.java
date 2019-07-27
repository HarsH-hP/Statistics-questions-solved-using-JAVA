import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
            n=sc.nextInt();
        }while( (n>=5) && !(n<=50) );
        int []X=new int[n];
        for(int i=0;i<X.length;i++){
            do{
                X[i]=sc.nextInt();
            }while( !(X[i]>0) && !(X[i]<=100) );
        }
        Arrays.sort(X);
        int q1=0,q2=0,q3=0;
        int mid=n/2,lmid=0,umid=0;        
        if(n%2==0){
            q2=(X[mid]+X[mid-1])/2;
            lmid=(mid-1)/2;
                if((mid-1)%2!=0){
                    q1=(X[lmid]+X[lmid+1])/2;
                }
                else{
                    q1=X[lmid];
                }
            umid=(mid+n-1)/2;
            if((n/2)%2==0){
                q3=(X[umid]+X[umid+1])/2;
            }
            else{
                q3=X[umid];
            }
        }
        else{
            q2=X[n/2];
            lmid=(mid-1)/2;
                if(((mid-1)%2)!=0){
                    q1=(X[lmid]+X[lmid+1])/2;
                }
                else{
                    q1=X[lmid];
                }
            
            if((n/2)%2==0){
                umid=(mid+n-1)/2;
                q3=(X[umid]+X[umid+1])/2;
            }
            else{
                umid=(mid+n)/2;
                q3=X[umid];
            }    
        }
        System.out.println(q1+"\n"+q2+"\n"+q3);
        
    }
}

