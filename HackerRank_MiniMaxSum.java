import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five
integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/


public class Solution {

    static void miniMaxSum(int[] arr) {
        int max = 0,min = arr[0],final_max=0,final_min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            final_max += arr[i];
            final_min += arr[i];
        }
        final_max -= max;
        final_min -= min;
        System.out.println(final_max+" "+final_min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
