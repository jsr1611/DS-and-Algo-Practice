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
        int num_zeros = 0;
        int num_ones = 0;

        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) == 0)
                num_zeros++;
            else {
                break;
            }
        }
        for (int i = num_zeros; i < 31; i++) {
            if ((n & (1 << i)) != 0)
                num_ones++;
            else {
                break;
            }
        }
        // set the zero we found to one
        n = n | (1 << (num_zeros + num_ones));

        // set all the ones from the right of this bit to 0.
        n = n & -(1 << (num_zeros + num_ones));

        // set all the zeros to one
        n = n | ((1 << (num_ones - 1)) - 1);
        return n;
    }
}
