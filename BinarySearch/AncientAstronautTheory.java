import java.util.HashMap;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 23:44
 * desc:
 * You are given a string dictionary, representing a partial lexicographic ordering of ancient astronauts' dictionary. Given a string s, return whether it's a lexicographically sorted string according to this ancient astronaut dictionary.
 *
 * Example 1
 * Input
 * dictionary = "acb"
 * s = "aaaa h ccc i bbb"
 * Output
 * true
 * Explanation
 * The only constraint is that a comes before c which comes before b .
 * Lexicographic order
 * To determine which comes first in lexicographic order, compare the first letters of both strings to see which is
 * smaller, and if they match, compare the second letters, and so on. If one string is shorter, then it comes first.
 *
 * For example, ["app", "apple", "orange"] is in lexicographic order.
 */

public class AncientAstronautTheory {
    public static void main(String[] args) {
        System.out.println(solve("acb", "aaaa h ccc i bbb"));

    }
    public static boolean solve(String dictionary, String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int count = 0;
        for(char c: dictionary.toCharArray()){
            dic.put(c, count);
            count++;
        }
        char a, b;
        Character last = null;
        for(int i = 0; i < s.length(); i++){
            a = s.charAt(i);
            if(dic.containsKey(a))
                if(last != null && dic.get(a) < dic.get(last))
                    return false;
                else
                    last = a;
        }
        return true;
    }
}
