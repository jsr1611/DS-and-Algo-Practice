import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/08 23:54
 */

public class MinimumBracketAddition {
    public int solve(String s) {
        int count = 0;
        int i = 0;
        Stack<Character> stack = new Stack<>();
        char c;
        while (s.length() > i) {
            c = s.charAt(i);
            if (c == ')') {
                if (stack.size() != 0 && stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(c);
            } else {
                stack.push(c);
            }
            i++;
        }
        return stack.size();
    }
}
