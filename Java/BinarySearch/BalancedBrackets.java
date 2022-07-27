import com.sun.tools.jconsole.JConsoleContext;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/27 12:48
 * desc: You're given a string s consisting solely of "(" and ")". Return whether the parentheses are balanced.
 * 'balanced brackets' means it contains no unmatched brackets.
 * For example, "(())" is balanced, while "(()))" is not.
 * Constraints
 * n ≤ 100,000 where n is the length of s.
 */

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(new BalancedBrackets().solve("(())"));
    }
    public boolean solve(String s) {
        if(s.length()%2 == 1) return false;
        int counter=0;
        for(int i=0; i<s.length(); i++){
            if(counter == 0 && s.charAt(i) == ')') return false;
            if(s.charAt(i) == '('){
                counter++;
            }
            else {
                counter--;
            }
        }
        return counter == 0;
    }
}
