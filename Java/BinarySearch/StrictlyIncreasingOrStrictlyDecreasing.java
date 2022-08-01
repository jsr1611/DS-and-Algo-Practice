import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 17:44
 * desc: Given a list of integers nums, return whether the list is strictly increasing or strictly decreasing.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 * Input
 * nums = [1, 2, 3, 4, 5]
 * Output
 * true
 * Explanation
 * This is strictly increasing.
 * Input
 * nums = [1, 2, 3, 4, 5, 5]
 * Output
 * false
 * Explanation
 * Since there's two duplicate 5 this is not strictly increasing.
 */

public class StrictlyIncreasingOrStrictlyDecreasing {
    public static void main(String[] args) {

    }
    public boolean solve(int[] nums) {
        Arrays.sort(nums);

        return false;
    }
}
