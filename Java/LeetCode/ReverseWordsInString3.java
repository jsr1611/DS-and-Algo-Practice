/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/21 00:32
 * 557. Reverse Words in a String III
 * desc:
 * Given a string s, reverse the order of characters in each word within a sentence while still
 * preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */

public class ReverseWordsInString3 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < arr.length; i++){
            sb.append(reverseString(arr[i].toCharArray()));
            if(i+1 < arr.length) sb.append(" ");
        }
        return sb.toString();
    }

    private char[] reverseString(char[] s) {
        int l=0, r=s.length-1;
        char c;
        while(l<r){
            c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
        return s;
    }
}
