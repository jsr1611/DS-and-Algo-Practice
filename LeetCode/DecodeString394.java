/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/11 13:56
 * desc: Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being
 * repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets
 * are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and
 * that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 *
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 *
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */

public class DecodeString394 {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {
        if(s.length() < 2) return s;
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int index = 0;
        char c;
        String str = "";

        for(int i=0; i < s.length();){
            c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                sb.append(c);
                i++;
                index++;
            }
            else if(Character.isDigit(c)){
                int len = 0;
                index = s.indexOf("[", index);
                num = Integer.parseInt(s.substring(i, index));
                str = s.substring(index+1, s.indexOf("]", index));
                sb.append(fill(str,num));
                index = s.indexOf("]", index) + 1;
                i = index;
            }
        }
        return sb.toString();
    }
    private static StringBuilder fill(String c, int num){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            sb.append(c);
        }
        return sb;
    }
}
