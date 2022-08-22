import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 17:18
 * desc: Given a list of integers nums, return a new list such that each element at index i of the new list
 * is the product of all the numbers in the original list except the one at i. Do this without using division.
 *
 * Constraints
 *
 * 2 ≤ n ≤ 100,000 where n is the length of nums
 *
 * Input
 * nums = [1, 2, 3, 4, 5]
 * Output
 * [120, 60, 40, 30, 24]
 * Explanation
 * 120 = 2 * 3 * 4 * 5, 60 = 1 * 3 * 4 * 5, and so on.
 */

public class SpecialProductList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static int[] solve(int[] nums) {
        int[] arr = new int[nums.length];
        int total = 1;
        int zeroIndex = -1;
        boolean hasMoreZeroes = false;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0) {
                if(zeroIndex != -1){
                    hasMoreZeroes = true;
                    break;
                }else{
                    zeroIndex = i;
                }
            }else
            {
                total *= nums[i];
            }
        }
        if(hasMoreZeroes) return arr;
        if(zeroIndex != -1) {
            arr[zeroIndex] = total;
            return arr;
        }
        for(int i=0; i < nums.length; i++){
            arr[i] = total / nums[i];
        }
        return arr;
    }
}
