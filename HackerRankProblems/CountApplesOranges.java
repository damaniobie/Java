import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* https://www.hackerrank.com/challenges/apple-and-orange/problem */

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int num_apples = 0,num_oranges=0;
        for(int i=0;i<apples.length;i++){
            if(apples[i] + a >= s && apples[i] + a <= t){
                num_apples += 1;
            }
        }
        for(int i=0;i<oranges.length;i++){
            if(oranges[i] + b >= s && oranges[i] + b <= t){
                num_oranges += 1;
            }
        }
        System.out.printf("%d\n%d",num_apples,num_oranges);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
