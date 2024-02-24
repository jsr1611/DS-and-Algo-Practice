public class Day005 {
    /*
    @description 1480. Running Sum of 1d Array
    @author jsr1611
    @reference https://leetcode.com/problems/running-sum-of-1d-array/description/
     */
    public int[] runningSum(int[] nums) {
        for(int i=1; i < nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }


    /*
    @description 1551. Minimum Operations to Make Array Equal
    @author jsr1611
    @reference https://leetcode.com/problems/minimum-operations-to-make-array-equal/description/
     */
    public int minOperations(int n) {
        return n * n / 4;
    }
}
