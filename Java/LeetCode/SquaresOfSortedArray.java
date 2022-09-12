/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/12 23:00
 * desc:
 * 977. Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 *
 */

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int l=0, r = nums.length-1;
        int[] arr = new int[nums.length];
        int res = r;
        for(int i=0; i < nums.length; i++){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                arr[res] = nums[l] * nums[l];
                l++;
            }else{
                arr[res] = nums[r] * nums[r];
                r--;
            }
            res--;
        }
        return arr;
    }
}
