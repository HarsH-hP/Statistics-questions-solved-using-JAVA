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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double e=2.71828;
        double m=2.5;
        double ans=(Math.pow(e,-m)*Math.pow(m,5))/fact(5);
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(ans));

    }
}

