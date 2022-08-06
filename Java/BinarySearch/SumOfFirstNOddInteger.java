/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/06 14:23
 * desc: Given an integer n, return the sum of the first n positive odd integers.
 *
 * Constraints
 *
 * n ≤ 1,000
 */

public class SumOfFirstNOddInteger {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static int solve(int n){
        int total = 0;
        int count = 1;
        while (n > 0){
            total += count;
            System.out.println(total + " = " + count);
            count+=2;
            n-=1;
        }
        return total;
    }
}
