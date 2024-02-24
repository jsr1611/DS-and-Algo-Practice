import java.util.Arrays;
/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/27 10:15
 * desc: You are given a list of integers nums, representing a decimal number and nums[i] is between [0, 9].
 * For example, [1, 3, 9] represents the number 139.
 * Return the same list in the same representation except modified so that 1 is added to the number.
 *
 * Constraints
 * 1 ≤ n ≤ 100,000 where n is the length of nums.
 *
 * Example 1
 *
 * Input
 * nums = [1, 9, 1]
 *
 * Output
 * [1, 9, 2]
 */

public class AddOneToList {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9,9, 9, 9};
        System.out.println(Arrays.toString(new AddOneToList().solve(arr)));
    }
    public int[] solve(int[] nums) {
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] != 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] arr = new int[nums.length+1];
        arr[0] = 1;
        return arr;
    }
}
