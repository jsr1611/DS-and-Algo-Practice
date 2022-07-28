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
        if(s2.length() < s1.length()) return false;
        if(s2.contains(s1)) return true;
        int pointer = s2.indexOf(s1.charAt(0));
        if(pointer < 0) return false;
        int nextIndex;
        for (int i = 1; i < s1.length(); i++) {
            nextIndex = s2.indexOf(s1.charAt(i), pointer+1);
            System.out.println(nextIndex);
            if(nextIndex == -1) return false;
            pointer = nextIndex;
        }
        return true;
    }
}
