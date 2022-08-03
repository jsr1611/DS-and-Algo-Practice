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
        Stack<String> stack = new Stack<>();
        String c, last = "";
        for(int i=0; i < s.length(); i++){
            c = String.valueOf(s.charAt(i));
            if(stack.size() != 0 && stack.peek().equals(c)){
                last = stack.pop();
            }
            else{
                if(!last.equals(c)){
                    last = stack.push(c);
                }
            }
        }
        return String.join("", stack);
    }
}

/*
//ALTERNATIVE, BUT NOT COMPLETE YET
if(s.length()==0) return s;
        StringBuilder str = new StringBuilder();
        char c, last = 0;
        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(str.length() != 0 && str.charAt(str.length()-1) == c){
                str.deleteCharAt(str.length()-1);
                if(str.length() != 0)
                    last = str.charAt(str.length()-1);
            }
            else{
                if(last != c){
                    str.append(c);
                    last = c;
                }
            }
        }
        return str.toString();
 */
