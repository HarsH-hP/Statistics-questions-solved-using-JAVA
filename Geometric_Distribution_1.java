import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        double probdefect=(double)1/3;
        int n=5;
        double ans=Math.pow(1-probdefect,n-1)*probdefect;
        DecimalFormat dc=new DecimalFormat("0.000");
        System.out.println(dc.format(ans));
    }
}

