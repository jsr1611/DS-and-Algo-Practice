import java.util.*;
import java.util.stream.Stream;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 00:24
 */

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 8, 7, 15, 0, 66, 88, 111, 11111, 2222,10, 5, 2, 7,2222,3333333,5555,10, 5, 2, 7, 4444444,111118,555,7, 15, 0, 66, 88, 111,3333333,5555,10, 5, 2, 7, 4444444,111118,555,7};
        System.out.println(Arrays.toString(new SlidingWindowMax().solve(nums, 5)));
    }
    public int[] solve(int[] nums, int k) {
        if(nums.length<=1) return nums;
        if(k >= nums.length) {
            Arrays.sort(nums);
            return new int[]{nums[nums.length - 1]};
        }

        int[] arr = new int[nums.length-(k-1)];
        int counter = 0, maxCounter = 0;
        //Arrays.stream(nums).
        int max = Integer.MIN_VALUE;
        for(int i=0; i < nums.length;){
            if(nums[i]>max){
                max = nums[i];
            }
            if(counter+1 == k){
                arr[maxCounter] = max;
                max = Integer.MIN_VALUE;
                counter = 0;
                maxCounter++;
                i = maxCounter;
            }else {
                counter++;
                i++;
            }
        }
        return arr;
    }
}
