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
        int[] arr1 = new int[nums.length];
        int counter = 0;
        //int prefix = 1;
        int suffix = nums.length-1;

        for(int i=0; i < nums.length; ){
            if(i+1 != suffix){
                if(i+1 != counter){
                    arr1[counter] = nums[i+1]*nums[suffix];
                    suffix--;
                }
                //prefix++;
                i++;
            }else {
                counter++;
                i = counter;
            }

        }
        return arr1;
    }
}
