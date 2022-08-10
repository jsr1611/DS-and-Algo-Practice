import java.util.ArrayList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/11 00:17
 * desc:
 * A rotation group for a string contains all of its unique rotations. For example, "123" can be rotated to "231" and "312" and they are all in the same rotation group.
 *
 * Given a list of strings words, group each word by their rotation group, and return the total number of groups.
 *
 * Constraints
 *
 * n ≤ 200 where n is the length of words.
 * Example 1
 * Input
 * words = ["abc", "xy", "yx", "z", "bca"]
 * Output
 * 3
 * Explanation
 * There are three rotation groups:
 *
 * ["abc", "bca"]
 * ["xy", "yx"]
 * ["z"]
 */

public class RotationGroups {
    public static void main(String[] args) {
        String[] arr = {"abc", "xy", "yx", "z", "bca"};
        System.out.println(solve(arr));
    }
    public static int solve(String[] words) {
        int num = 0;
        List<String> group = new ArrayList<>();
        boolean counted = false;
        for (String word : words) {
            counted = false;
            for (String s : group) {
                if (s.length() == word.length() && (s + s).contains(word)) {
                    counted = true;
                }
            }
            if (!counted) {
                group.add(word);
                num++;
            }
        }

        return num;
    }
}
