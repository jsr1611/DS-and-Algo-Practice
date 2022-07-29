import java.time.Period;
import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 13:31
 * desc: Given a list of integers nums, find the first missing positive integer.
 * In other words, find the lowest positive integer that does not exist in the list.
 * The list can contain duplicates and negative numbers as well.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums.
 */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(solve(arr));
    }
    public static int solve(int[] nums) {
        int smallestMissing = 1;
        nums = Arrays.stream(nums).filter(x -> x > 0).distinct().sorted().toArray();
        if(nums.length==0) return smallestMissing;
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length;i++){
            if(nums[i] > smallestMissing) return nums[i]-1;
            else {
                smallestMissing +=1;
            }
        }
        return smallestMissing;
    }
}
