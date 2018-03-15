import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in a number 
that is less than 40.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. Complete the function solve
that takes an integer array of all grades, and return an integer array consisting of the rounded grades. For each grade[i], round it
according to the rules above and print the result on a new line.

*/

public class Solution {

    static int[] solve(int[] grades){
        int [] finalGrades = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            int nextFive = next5(grades[i]);
            if(grades[i] >= 38){
                if(nextFive - grades[i] < 3){
                    grades[i] = nextFive;
                    finalGrades[i] = grades[i];
                }else{
                    finalGrades[i] = grades[i];
                }
            }else{
                finalGrades[i] = grades[i];
            }
        }
        return finalGrades;
    }
    
   static int next5(int x){
        int n=x;
        if(x%10==1 || x%10==6){
            n = x+4;
        }else if(x%10==2 || x%10==7){
            n = x+3;
        }else if(x%10==3 || x%10==8){
            n = x+2;
        }else if(x%10==4 || x%10==9){
            n = x+1;
        }else{
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
