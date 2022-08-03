/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 19:50
 * desc: Given a positive integer num, return the sum of its digits.
 *
 * Bonus: Can you do it without using strings?
 *
 * Constraints
 *
 * 0 ≤ num < 2 ** 31
 */

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(123));
    }
    public static int solve(int num) {
        int total = 0;
        while(num > 0){
            if(num > 9){
                total += (num % 10);
                num = num / 10;
            }
            else{
                return total+num;
            }
        }
        return total;
    }
}
