/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 09:55
 * desc: Given a lowercase alphabet string s, return the length of the longest substring with same characters.
 *
 * Constraints
 *
 * 0 ≤ n ≤ 100,000 where n is the length of s
 */

public class LongestConsecutiveDuplicateString {
    public static void main(String[] args) {
        System.out.println(solve("bbccaa"));
    }
    public static int solve(String s) {
        int count = 1, max = 0;
        if(s.length()==0 || s.isBlank()) return 0;
        char c, next;
        for (int i=0; i < s.length()-1; i++){
            c = s.charAt(i);
            next = s.charAt(i+1);
            if(c == next){
                count++;
            }
            else {
                if(max < count) {
                    max = count;
                }
                count = 1;
            }
        }
        if(max < count) max = count;

        return max;
    }
}
