import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Lily likes to play games with integers and their reversals. For some integer x, we define reverse(x) to be the reversal of all digits in . 
For example,reverse(123) = 321. Logan wants to go to the movies with Lily on some day  satisfying i<x<j, but he knows she only goes to the
movies on days she considers to be beautiful. Lily considers a day to be beautiful if the absolute value of the difference 
between x and reversed(x) is evenly divisible by k.

Given , , and , count and print the number of beautiful days when Logan and Lily can go to the movies.
*/

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        int day = i;
        int count = 0;
        while(i <= j){
        int rev_day = rev(day);
        if((day - rev_day) % k == 0){count++;}
            i++;
            day++;
        }
        
        return count;
    }
    
    static int rev(int x){
        int rev = 0;
        while(x!=0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
