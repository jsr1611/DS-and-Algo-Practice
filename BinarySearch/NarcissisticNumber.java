/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/31 10:25
 * desc: Given an integer n, return whether it is equal to the sum of its own digits raised to the power of the number of digits.
 *
 * Example 1
 * Input
 * n = 153
 * Output
 * true
 * Explanation
 * 153 = 1 ** 3 + 5 ** 3 + 3 ** 3
 */

public class NarcissisticNumber {
    public boolean solve(int n) {
        String numStr = String.valueOf(n);
        int power = numStr.length();
        int total = 0, num;
        for(int i = 0; i < numStr.length(); i++){
            num = Character.getNumericValue(numStr.charAt(i));
            total += Math.pow(num, power);
        }
        return total == n;
    }
}
