import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/27 23:39
 * desc: Given an integer n, return a list with each number from 1 to n, except if it's a multiple of 3 or has a 3, 6, or 9 in the number, it should be the string "clap".
 *
 * Note: return the number as a string.
 *
 * Constraints
 *
 * n ≤ 100,000
 * Example 1
 * Input
 * n = 16
 * Output
 * ["1", "2", "clap", "4", "5", "clap",
 * "7", "8", "clap", "10", "11", "clap",
 * "clap", "14", "clap", "clap"]
 */

public class ThreeSixNine {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ThreeSixNine().solve(16)));
    }
    public String[] solve(int n) {
        String[] result = new String[n];
        String val = "";
        for(int i=1; i <= n; i++){
            val = String.valueOf(i);
            if(i%3==0 || val.contains("3") || val.contains("6") || val.contains("9")){
                result[i-1] = "clap";
            }
            else {
                result[i-1] = String.valueOf(i);
            }
        }
        return result;
    }
}
