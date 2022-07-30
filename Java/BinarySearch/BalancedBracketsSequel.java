import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/30 01:03
 * desc: Given a string s containing round, curly, and square open and closing brackets, return whether the brackets are balanced.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 */

public class BalancedBracketsSequel {
    public static void main(String[] args) {
        System.out.println(solve("[])("));
    }
    public static boolean solve(String s) {
        if(s.length()==0) return true;
        if(s.length()%2 != 0) return false;
        Stack<Character> store = new Stack<>();
        char c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            switch (c){
                case ')':
                    if(store.size() == 0 || !store.peek().equals('('))
                        return false;
                    store.pop();
                    break;
                case '}':
                    if(store.size() == 0 || !store.peek().equals('{'))
                        return false;
                    store.pop();
                    break;
                case ']':
                    if(store.size() == 0 || !store.peek().equals('['))
                        return false;
                    store.pop();
                    break;
                default:
                    store.push(c);
            }
        }
        return store.size() == 0;
    }
}
