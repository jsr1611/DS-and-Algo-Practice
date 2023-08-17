public class Day008 {

    /*
    @description 2652. Sum Multiples
    @author jsr1611
    @reference https://leetcode.com/problems/sum-multiples/
     */
    public int sumOfMultiples(int n){
        int result = 0;

        result = calcArithmetic(3, n);
        result += calcArithmetic(5, n);
        result += calcArithmetic(7, n);
        result += calcArithmetic(3*5*7, n);
        result -= calcArithmetic(3*5, n);
        result -= calcArithmetic(3*7, n);
        result -= calcArithmetic(7*5, n);

        return result;
    }

    public int calcArithmetic(int a1, int num){
        int n = num / a1;
        int an = n * a1;
        return  n * (a1 + an) / 2;
    }

}
