import java.util.HashSet;
import java.util.Set;

public class Day3 {
    /*
    @description 2119. A Number After a Double Reversal
    @author: jsr1611
    @reference https://leetcode.com/problems/a-number-after-a-double-reversal/description/
     */
    public boolean isSameAfterReversals(int num) {
        return num % 10 != 0 || num == 0;
    }


    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i < nums.length; i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }

    private int reverse(int num){
        int reved = 0;
        while(num > 0){
            reved = reved * 10 + num % 10;
            num /= 10;
        }
        return reved;
    }
}
