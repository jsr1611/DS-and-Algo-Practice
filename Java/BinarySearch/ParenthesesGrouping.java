import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/05 05:58
 * desc: Given a string s containing balanced parentheses "(" and ")", split them into the maximum number of balanced groups.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is length of s.
 */

public class ParenthesesGrouping {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve("()()(()())")));
    }
    public static String[] solve(String s) {
        int count = 0, closed=0;
        StringBuilder opening = new StringBuilder();
        for (int i=0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(closed > 0 && count == 0){
                    opening.append(" ");
                    closed = 0;
                }
                count++;
                opening.append("(");
            }
            else{
                count--;
                closed++;
                opening.append(")");
            }

        }
        return opening.toString().split(" ");
    }
}
