import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day004 {

    /*
    @description 1342. Number of Steps to Reduce a Number to Zero
    @author jsr1611
    @reference https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
     */
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0){
            num = num % 2 == 0 ? num/2 : num-1;
            count++;
        }
        return count;
    }



    int[][] base = {{0}, {5}, {1,2,3,4,5}};
    /*
    @description 1641. Count Sorted Vowel Strings
    @author jsr161
    @reference https://leetcode.com/problems/count-sorted-vowel-strings/description/
     */
    public int countVowelStrings(int n) {
        return Arrays.stream(count(n)).sum();
    }
    private int[] count(int k){
        int[] result = null;
        if(k >=0 && k <= 2){
            return base[k];
        }

        result = count(k-1);
        for(int i=1; i<result.length; i++){
            result[i] = result[i] + result[i-1];
        }
        return result;
    }




}
