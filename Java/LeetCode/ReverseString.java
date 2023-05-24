/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/21 00:24
 * 344. Reverse String
 * desc: Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int l=0, r=s.length-1;
        char c;
        while(l<r){
            c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
    }
}
