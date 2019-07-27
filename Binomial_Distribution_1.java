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
       //Main method 
        Scanner sc=new Scanner(System.in);
        double boy=sc.nextDouble();
        double girl=sc.nextDouble();
        boy=boy/(boy+girl);
        girl=1-boy;
        double combi=0,sum=0;
        for(int i=3;i<=6;i++){
          combi=(fact(6)/((fact(i)*(fact(6-i)))))*Math.pow(boy,i)*Math.pow(girl,(6-i));
          sum=sum+combi;
        }
        DecimalFormat dc=new DecimalFormat("0.000");
        System.out.println(dc.format(sum));
    }
}

