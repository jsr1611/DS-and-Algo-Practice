import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 11:21
 * desc: Given a list of strings strs, containing the strings "red", "green" and "blue",
 * partition the list so that the red come before green, which come before blue.
 *
 * This should be done in O(n) time.
 *
 * Bonus: Can you do it in O(1) space? That is, can you do it by only rearranging the list
 * (i.e. without creating any new strings)?
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of strs.
 *
 * Example 1
 * Input
 * strs = ["green", "blue", "red", "red"]
 * Output
 * ["red", "red", "green", "blue"]
 */

public class ListPartitioning {
    public static void main(String[] args) {
        String[] arr = {"green", "blue", "red", "red"};
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static String[] solve(String[] strs) {
        int low = 0, mid = 0, high = strs.length-1;
        String tmp;
        for (int i=0; i < strs.length; i++){
            if(strs[mid].equals("red")){
                tmp = strs[low];
                strs[low] = strs[mid];
                strs[mid] = tmp;
                low++;
                mid++;
            }
            else if(strs[mid].equals("blue")){
                tmp = strs[high];
                strs[high] = strs[mid];
                strs[mid] = tmp;
                high--;
            }
            else
                mid++;
        }
        return strs;
    }

}
