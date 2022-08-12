/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/12 15:53
 * desc:
 * Given a positive integer n, return the smallest next higher integer with the same number of 1s as n in binary representation.
 *
 * Constraints
 *
 * 1 ≤ n < 2 ** 30
 * Example 1
 * Input
 * n = 3
 * Output
 * 5
 * Explanation
 * 3 in binary is 0011 and next higher from 3 with two ones would be 5 which is 0101 in binary.
 */

public class NextBinaryPermutation {
    public int solve(int n) {
        int bitCount = Integer.bitCount(n);
        int result = n+1;
        while(true){
            if(Integer.bitCount(result) == bitCount) return result;
            else
                result++;
        }
    }
}
