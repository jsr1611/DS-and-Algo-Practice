/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/22 09:59
 * desc:
 * You are given a list nums of length n + 1 picked from the range 1, 2, ..., n.
 * By the pigeonhole principle, there must be a duplicate. Find and return it.
 * There is guaranteed to be exactly one duplicate.
 *
 * Bonus: Can you do this in O(n) time and O(1) space?
 *
 * Constraints
 *
 * n ≤ 10,000
 * Example 1
 * Input
 * nums = [1, 2, 3, 1]
 * Output
 * 1
 */

public class DetectOnlyDuplicate {
    public int solve(int[] nums) {
        int len = nums.length-1;
        int sum = len * (len + 1) / 2;  // Finding the sum of n integers (1,2,3,...,n)
        for(int num : nums){
            sum -= num;
        }
        return Math.abs(sum);
    }
}
