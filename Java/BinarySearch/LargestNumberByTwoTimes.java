import java.util.Arrays;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 16:19
 * desc: Given a list of integers nums, return whether the largest number is bigger than the second-largest number by more than two times.
 *
 * Constraints
 *
 * 2 ≤ n ≤ 100,000 where n is the length of nums
 * Input
 *      nums = [3, 6, 9]
 * Output
 *      false
 * Explanation
 *      9 is not bigger than 2 * 6.
 *
 * Input
 *      nums = [3, 6, 15]
 * Output
 *      true
 * Explanation
 *      15 is bigger than 12 (2 * 6).
 */

public class LargestNumberByTwoTimes {
    public static void main(String[] args) {
        int[] arr = {1,0};
        System.out.println(solve(arr));
    }
    public static boolean solve(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        Arrays.sort(nums);
        return secondLargest * 2 < largest;
    }
}
