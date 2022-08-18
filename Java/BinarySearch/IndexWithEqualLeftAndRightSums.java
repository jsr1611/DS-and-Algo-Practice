
/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/09 00:15
 * desc: Given a list of integer nums, return the earliest index i such that the sum of the numbers left of i
 * is equal to the sum of numbers right of i. If there's no solution, return -1.
 *
 * Sum of an empty list is defined to be 0.
 *
 * Constraints
 *
 * 1 ≤ n ≤ 100,000 where n is the length of nums
 *
 * Example 1
 * Input
 * nums = [2, 3, 4, 0, 5, 2, 2]
 * Output
 * 3
 * Explanation
 * Sum of the numbers left of index 3 is 9 and sum of the numbers right of index 3 also 9.
 */

public class IndexWithEqualLeftAndRightSums {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,2,-4}));
    }

    public static int solve(int[] nums) {
        int n = nums.length;

        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            ps[i] = ps[i-1] + nums[i];
        }

        int left_sum = 0;
        int right_sum = 0;
        int index = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(i == 0)
            {
                left_sum = 0;
                right_sum = ps[n-1] - ps[0];
            }
            else
            {
                left_sum = ps[i-1];
                right_sum = ps[n-1] - ps[i];
            }


            if(left_sum == right_sum)
            {
                index = i;
                break;
            }

        }

        if(index == -1)
        {
            return -1;
        }
        return index;
    }
}
