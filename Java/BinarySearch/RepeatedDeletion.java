import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 12:34
 * desc: Given a string s, repeatedly delete the earliest consecutive duplicate characters.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s.
 *
 * Example 1
 * Input
 * s = "abbbaac"
 * Output
 * "c"
 * Explanation
 * "bbb" are the earliest consecutive duplicate characters which gets deleted. So we have "aaac".
 * "aaa" then gets deleted to end up with "c".
 */

public class RepeatedDeletion {
    public static void main(String[] args) {
        System.out.println(solve("baa"));
    }
    public static String solve(String s) {
        if(s.length()==0) return s;
        Stack<Character> stack = new Stack<>();
        int i=0;
        while (i < s.length()){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                int j = i;
                while (j < s.length() && stack.peek() == s.charAt(j)) j++;
                stack.pop();
                i = j;
            }
            else{
                    stack.push(s.charAt(i++));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: stack) sb.append(c);
        return sb.toString();
    }
}
