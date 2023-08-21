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
}
