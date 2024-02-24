/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 10:48
 * desc: Given a list of integers nums, find the largest product of two distinct elements.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 */

public class MaxProductOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 0};
        System.out.println(solve(arr));
    }
    public static int solve(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) {
            return nums[0] * nums[1];
        }
        int max = nums[0], max2 = nums[1];
        int min = max, min2 = max2;
        for(int i=1; i < nums.length;i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
            }
            else if(nums[i] > max2)
                max2 = nums[i];
            if(nums[i] < min){
                min2 = min;
                min = nums[i];
            }
            else if(nums[i] < min2)
                min2 = nums[i];
        }
        return Math.max(max * max2, min * min2);
    }
}
