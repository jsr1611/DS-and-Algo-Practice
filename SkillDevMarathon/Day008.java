public class Day008 {

    /*
    @description 2652. Sum Multiples
    @author jsr1611
    @reference https://leetcode.com/problems/sum-multiples/
     */
    public int sumOfMultiples(int n){
        return calcArithmetic(3, n) + calcArithmetic(5, n) + calcArithmetic(7, n) + calcArithmetic(3*5*7, n)
        - calcArithmetic(3*5, n) - calcArithmetic(3*7, n) - calcArithmetic(7*5, n);
    }

    public int calcArithmetic(int a1, int num){
        int n = num / a1;
        int an = n * a1;
        return  n * (a1 + an) / 2;
    }


    /*
    @description 2221. Find Triangular Sum of an Array
    @author jsr1611
    @reference https://leetcode.com/problems/find-triangular-sum-of-an-array/
     */
    public int triangularSum(int[] nums){
        int len = nums.length;
        if(len==1) return nums[0];
        int[] tmp = nums;
        while (len > 2){
            tmp = new int[len-1];
            for (int i = 0; i < len-1; i++){
                tmp[i] = ((nums[i]+nums[i+1]) > 9) ? (nums[i]+nums[i+1]) % 10 : (nums[i]+nums[i+1]);
            }
            nums = tmp;
            len--;
        }
        return (tmp[0]+tmp[1]) > 9 ? (tmp[0]+tmp[1]) % 10 : (tmp[0]+tmp[1]);
    }


    public static void main(String[] args) {

        System.out.println(new Day008().triangularSum(new int[]{2,6,6,5,5,3,3,8,6,4,3,3,5,1,0,1,3,6,9}));
    }

}
