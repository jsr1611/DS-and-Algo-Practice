/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 18:23
 * desc: Given a non-negative integer num, return whether it is a palindrome.
 *
 * Bonus: Can you solve it without using strings?
 *
 * Constraints
 *
 * num < 2 ** 31
 */

public class PalindromicInteger {
    public boolean solve(int num) {
        int reverse = 0;
        int temp = num;
        while(num > 9){
            reverse = reverse * 10 + (num%10);
            num /= 10;
        }
        reverse = reverse * 10 + num;
        return reverse == temp;
    }
}
