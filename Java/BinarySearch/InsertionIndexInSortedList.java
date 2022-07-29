/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 20:54
 * desc: Given a list of integers nums, sorted in ascending order, and a number target,
 * return the index where target should be inserted to keep nums sorted. If target already exists in nums,
 * return the largest index where target can be inserted.
 *
 * This should be done in O(log n).
 *
 * Constraints
 *
 * 1 ≤ n ≤ 100,000 where n is the length of nums
 */

public class InsertionIndexInSortedList {
    public static void main(String[] args) {
        int[] arr = {0,0,2,2,3};
        System.out.println(solve(arr, 0));
    }
    public static int solve(int[] nums, int target) {
        if(nums[nums.length-1] <= target ) return nums.length;
        if(nums.length==1) return 0;
        int first = 0, last = nums.length-1, mid=0;
        while (first <= last){
            mid = (first + last) / 2;
            if(nums[mid] < target){
                first = mid + 1;
            }
            else if(nums[mid] == target){
                if(mid+1 < nums.length && nums[mid+1] == target) {
                    first = mid+1;
                }
                else
                    return (mid+1);
            }
            else {
                last = mid-1;
            }
        }
        return mid;
    }
}
