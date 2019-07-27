import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static double fact(int a){
        double sum=1;
        for(int i=1;i<=a;i++){
            sum*=i;
        }
        return(sum);
    }
    
    public static void main(String[] args) {       
      
        double preject=0.12;
        double pnot=1-preject;
        double combi=0,sum=0,nextsum=0;
        for(int i=0;i<=2;i++){
          combi=(fact(10)/((fact(i)*(fact(10-i)))))*Math.pow(preject,i)*Math.pow(pnot,(10-i));
          sum=sum+combi;
          if(i==1){
              nextsum=sum;
          }
        }
        DecimalFormat dc=new DecimalFormat("0.000");
        System.out.println(dc.format(sum));
        System.out.println(dc.format(1-nextsum));
    }
}

