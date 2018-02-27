import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out 
candles successfully, since the tallest candle is of height  and there are  such candles.

*/

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int blow = 0,max = ar[0];
        for(int i=0;i<n;i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        for(int i=0;i<n;i++){
            if(ar[i] == max){
                blow++;
            }
        }
        return blow;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
