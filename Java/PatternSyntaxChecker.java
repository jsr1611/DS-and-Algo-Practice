/*
Author: Jumanazar Saidov
Definition:
   Using Regex, we can easily match or search for patterns in a text.
   Before searching for a pattern, we have to specify one using some well-defined syntax.

   In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

   Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
   link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");

            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            finally{
                testCases -= 1;
            }
        }
    }
}