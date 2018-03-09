import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
You are given an array of n integers,a[0],a[1],....a[n-1], and a positive integer, k. Find and print the number 
of (i,j) pairs where i<j and a[i] + a[j] is divisible by k.

*/

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int num_div = 0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i < j && (ar[j]+ar[i]) % k == 0)
                    num_div++;
            }
        }
        return num_div;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
