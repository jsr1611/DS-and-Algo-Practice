public class Day012 {

    /*
    @description 1672. Richest Customer Wealth
    @author jsr1611
    @reference https://leetcode.com/problems/richest-customer-wealth/
     */
    public int maxWealth(int[][] accounts){
        int[] mwC = new int[accounts.length];
        int max = 0;
        int tmpMax = 0;
        int count = 0;

        for (int[] account : accounts) {
            for (int bankBalance : account) {
                mwC[count] += bankBalance;
            }
            tmpMax = mwC[count];
            max = tmpMax > max ? tmpMax : max;
            count++;
        }
        return max;
    }
}
