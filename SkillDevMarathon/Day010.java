public class Day010 {

    /*
    @description 2011. Final Value of Variable After Performing Operations
    @author jsr1611
    @reference https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
     */
    public int finalValueAfterOperations(String[] operations){
        int result = 0;
        for(String op: operations){
            result += op.contains("++") ? 1 : -1;
        }
        return result;
    }


    /*
    @description 189. Rotate Array
    @author jsr1611
    @reference https://leetcode.com/problems/rotate-array/
     */
    public void rotate(int[] nums, int k){
        int length = nums.length;
        int source = 0;
        int target = 0;
        for (int i=0; i < length; i++){
            target = (target + k) % length;
            if(source == target){
                source++;
                target++;
            }
            else {
                int tmp = nums[target];
                nums[target] = nums[source];
                nums[source] = tmp;
            }
        }
    }
}
