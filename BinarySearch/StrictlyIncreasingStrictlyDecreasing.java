/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/02 00:23
 * desc: Given a list of integers nums, return whether the list is strictly increasing or strictly decreasing.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 *
 */

public class StrictlyIncreasingStrictlyDecreasing {
    public static void main(String[] args) {
        int[] arr = {2,0,0};
        System.out.println(solve(arr));
    }
    public static boolean solve(int[] nums) {
        boolean strictlyInc = false, strictlyDec = false;
        int len = nums.length;
        if(len == 2) return nums[0] != nums[1];
        for(int i=0; i < len-1; i++){
            if(nums[i+1] == nums[i]) return false;
            else if(nums[i+1] > nums[i]){
                if(strictlyDec) return false;
                strictlyInc = true;
            }
            else {
                if (strictlyInc) return false;
                strictlyDec = true;
            }
        }
        return true;
    }
}