import java.util.HashMap;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/27 12:27
 * desc: Given a list of numbers nums and a number k, return whether any two elements from the list add up to k.
 * You may not use the same element twice.
 * Note: Numbers can be negative or 0.
 * Constraints
 * n ≤ 100,000 where n is the length of nums
 * Input
 *      nums = [35, 8, 18, 3, 22]
 *      k = 11
 * Output
 *      true
 * Explanation
 *      8 + 3 = 11
 */

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {35, 8, 18, 3, 22};
        int k = 11;
        System.out.println(new SumOfTwoNumbers().solve(nums, k));
    }
    public boolean solve(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if(map.containsKey(k - nums[i])){
                return true;
            }else {
                map.put(nums[i], 0);
            }
        }
        return false;
    }
}
