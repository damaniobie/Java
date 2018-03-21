import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer,
its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
How tall will her tree be after n growth cycles?
*/

public class Solution {

    static int utopianTree(int n) {
        int h = 1;
        if(n==0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            if(i % 2 ==0){
                h++;
            }else{
                h *= 2;
            }
        }
        return h;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
