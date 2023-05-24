import java.util.Arrays;
public class Kata
{
    public static boolean smallEnough(int[] a, int limit)
    {
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