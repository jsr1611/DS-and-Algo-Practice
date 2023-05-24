import java.util.Arrays;
public class Kata
{
    public static boolean smallEnough(int[] a, int limit)
    {
        // problem: https://www.codewars.com/kata/57cc981a58da9e302a000214/java

        // solution(s):
        // brute-force
        //     for(int num: a){
        //       if(num > limit) return false;
        //     }
        //       return true;

        //optimised solution
        Arrays.sort(a);
        return a[a.length - 1] <= limit;
    }
}