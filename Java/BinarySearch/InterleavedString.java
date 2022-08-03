/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 12:11
 * desc: Given two strings s0 and s1, return the two strings interleaved, starting with s0.
 * If there are leftover characters in a string they should be added to the end.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s0
 * m ≤ 100,000 where n is the length of s1
 *
 * Example 1
 * Input
 * s0 = "abc"
 * s1 = "xyz"
 * Output
 * "axbycz"
 * Example 2
 * Input
 * s0 = "abc"
 * s1 = "x"
 * Output
 * "axbc"
 */

public class InterleavedString {
    public static void main(String[] args) {
        System.out.println(solve("ab", "xaaa"));
    }
    public static String solve(String s0, String s1) {
        StringBuilder prefix = new StringBuilder();
        int len_0 = s0.length();
        int len_1 = s1.length();
        int len = Math.min(len_0, len_1);
        if(len == 0) return s0+s1;
        for(int i=0; i < len; i++){
            if(i < len_0-1){
                prefix.append(s0.charAt(i));
            }
            else
                return prefix.append(s0.charAt(i)).append(s1.substring(i)).toString();
            if(i < len_1-1)
                prefix.append(s1.charAt(i));
            else
                return prefix.append(s1.charAt(i)).append(s0.substring(i+1)).toString();
        }
        return prefix.toString();
    }
}
