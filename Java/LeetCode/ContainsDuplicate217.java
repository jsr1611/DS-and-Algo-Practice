import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/01 09:43
 * desc:
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 */

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        /*
        // Memory optimized approach with O(nlogn) time complexity and O(1) memory usage
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0; i < len-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
         */

        // Time optimized approach with O(n) time complexity and memory usage
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i=0; i < len; i++){
            if(map.containsKey(nums[i])) return true;
            else
                map.put(nums[i], 0);
        }
        return false;
    }
}
