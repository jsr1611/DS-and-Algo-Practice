import java.util.Stack;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/02 23:29
 * desc: Given a string s consisting of open and closed brackets "(" and ")",
 * return the length of the longest substring in s that is a valid string of parentheses.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 */

public class MultipleParentheses {
    public static void main(String[] args) {
        System.out.println(solve("(()()(()(("));
    }
    public static int solve(String s) {
        int max = 0, counter = 0, opened=0, closed=0;
        boolean continuous = true;
//        Stack<Character> store = new Stack<>();
//        char c;
//        for(int i = 0; i < s.length(); i++){
//            c = s.charAt(i);
//            if (c == ')') {
//                if (store.size() == 0 || !store.peek().equals('(')) {
//                    if (max < counter) max = counter;
//                    counter = 0;
//                    continuos = false;
//                } else {
//                    store.pop();
//                    closed++;
//                    counter++;
//                    if (store.size() == 0) {
//                        if (max < counter) max = counter;
//                        if(!continuos)
//                            counter = 0;
//                        continuos = true;
//                    }
//                    if(continuos && opened > 0 && Math.abs(opened-closed) > max) max = Math.abs(opened - closed) ;
//                }
//            } else {
//                opened++;
//                store.push(c);
//                counter++;
//            }
//        }
//        if(store.size()==0 && max < counter) max = counter;
//        //if(continuos && opened > 0 && Math.abs(opened-closed) > max) max = Math.abs(opened - closed);
        char c;
        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            System.out.println(i+": " + c);
            if(c == '('){
                opened++;
            }
            else {
                closed++;
            }
        }

        return max;
    }
}
