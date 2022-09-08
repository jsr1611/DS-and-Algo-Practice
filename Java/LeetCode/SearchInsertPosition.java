/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/09 07:11
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        //return target < nums[0] ? 0 : target > nums[nums.length-1] ? nums.length : binarySearch(nums, target);
        if(target < nums[0])
            return 0;
        if(target > nums[nums.length-1])
            return nums.length;
        int index = 0;
        int low=0, high = nums.length-1;
        while(low < high){
            int mid = low + (high-low) / 2;
            if(nums[mid] > target){
                high = mid-1;
                index = high;
            }else if(nums[mid] < target){
                low = mid+1;
                index = low;
            }
            else{
                index = mid;
                break;
            }
        }
        if(nums[index] == target) return index;
        else{
            return nums[index] < target ? index+1 : index;
        }
    }
}
