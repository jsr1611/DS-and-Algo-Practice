/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/23 09:34
 * desc:
 * Given a list of integers nums sorted in ascending order and an integer k, return whether any two elements
 * from the list add up to k. You may not use the same element twice.
 *
 * Note: Numbers can be negative or 0.
 *
 * This should be done in \mathcal{O}(1)O(1) space.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 * Input
 * nums = [1, 3, 5, 8]
 * k = 6
 * Output
 * true
 * Explanation
 * We can have 1 + 5 = 6.
 */

public class SumOfTwoNumbersSorted {
    public boolean solve(int[] nums, int k) {
        int len = nums.length;
        if(len < 2) return false;
        int a=0, z=len-1;
        for(int i=0; i < len; i++){
            if(nums[a] + nums[z] == k && a<z) return true;
            else if(nums[a]+nums[z] > k){
                z--;
            }
            else{
                a++;
            }
        }
        return false;
    }
}
