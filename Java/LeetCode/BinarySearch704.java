/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/01 10:18
 * desc:
 * 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Related Topics: Array, Binary Search
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -10^4 < nums[i], target < 10^4
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        //if(target < nums[0] || target > nums[nums.length-1]) return -1;
        if(target==nums[0]) return 0;
        int low=0, high=nums.length-1, mid = 0;
        while(low <= high){
            mid = low+(high-low)/2;
            if(nums[mid] < target)
                low = mid+1;
            else if(nums[mid] > target)
                high = mid-1;
            else
                return mid;
        }
        return -1;
    }
}

