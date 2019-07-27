import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        double meanA=0.88;
        double meanB=1.55;
        double costX=160+(40*(meanA+Math.pow(meanA,2)));
        double costY=128+(40*(meanB+Math.pow(meanB,2)));
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(costX));
        System.out.println(df.format(costY));
    }
}

