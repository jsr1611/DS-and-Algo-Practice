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

    public static int[] digitize(long n) {
        // Code here
        // problem: https://www.codewars.com/kata/5583090cbe83f4fd8c000051/java

        //solution(s):
        String numStr = n + "";
        int length = numStr.length();
        int[] array = new int[length];
        for(int i=0; i < length; i++){
            array[length-1-i] = numStr.charAt(i) - 48;
        }
        return array;
    }

    public static double findUniq(double arr[]) {
        //problem: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
        // solution(s):
        // Do the magic
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]: arr[0];
    }
}