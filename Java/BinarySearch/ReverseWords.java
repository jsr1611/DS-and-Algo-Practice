/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/23 13:27
 * desc:
 * Given a string s of words delimited by spaces, reverse the order of words.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 * Example 1
 * Input
 * sentence = "hello there my friend"
 * Output
 * "friend my there hello"
 */

public class ReverseWords {
    public String solve(String sentence) {
        String[] arr = sentence.split(" ");
        String temp = "";
        for(int i=0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return String.join(" ", arr);
    }
}
