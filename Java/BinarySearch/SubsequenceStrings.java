/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 15:12
 * desc: Given two lowercase alphabet strings s1 and s2, determine if s1 is a subsequence of s2.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s1
 * m ≤ 100,000 where m is the length of s2
 *
 * Input
 * s1 = "ppl"
 * s2 = "apple"
 * Output
 * true
 *
 * Input
 * s1 = "ale"
 * s2 = "apple"
 * Output
 * true
 *
 *
 * Input
 * s1 = "elppa"
 * s2 = "apple"
 * Output
 * false
 */

public class SubsequenceStrings {
    public static void main(String[] args) {
        System.out.println(solve("aa", "aba"));
    }
    public static boolean solve(String s1, String s2) {
        if(s2.contains(s1)) return true;
        if(s2.length() < s1.length()) return false;
        int pointer = 0;
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == s1.charAt(pointer)){
                if(pointer == s1.length()-1 ) return true;
                pointer++;
            }
        }
        return false;
    }
}
