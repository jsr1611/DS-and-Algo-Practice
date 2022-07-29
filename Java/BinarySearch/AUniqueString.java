/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 18:33
 * desc: Given a lowercase alphabet string s, determine whether it has all unique characters.
 * url: https://binarysearch.com/problems/A-Unique-String
 *
 * Constraints
 *
 * 0 ≤ n ≤ 100,000 where n is the length of s
 *
 */

public class AUniqueString {
    public boolean solve(String s) {
        if(s.length() == 1) return true;
        for(int i=0; i < s.length()/2; i++){
            if(s.lastIndexOf(s.charAt(i)) != i || s.indexOf(s.charAt(s.length()-1-i)) != (s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
