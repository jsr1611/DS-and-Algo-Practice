import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 10:10
 * desc: Given a string of parentheses s, return the minimum number of parentheses to be removed to make the string balanced.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 */

public class RemovingParentheses {
    public static void main(String[] args) {
        System.out.println(solve("()())()"));
    }
    public static int solve(String s) {
        int open = 0, closed = 0, total = 0;
        char c;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else {
                if(stack.size() != 0 && stack.peek() == '('){
                    stack.pop();
                }
                else
                    stack.push(c);
            }
        }
        return stack.size();

    }
}
