
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
    public boolean solve(Long num) {
        String numStr = num.toString();
        int len = numStr.length();
        int start = 0;
        while (start < len/2){
            if(numStr.charAt(start) != numStr.charAt(len-1-start)){
                return false;
            }
            start += 1;
        }
        return true;
//        long reverse = 0;
//        long temp = num;
//        while(num > 9){
//            reverse = reverse * 10 + (num%10);
//            num /= 10;
//        }
//        reverse = reverse * 10 + num;
//        return reverse == temp;
    }

    public static void main(String[] args) {
        PalindromicInteger p = new PalindromicInteger();
        System.out.println(p.solve(432101101230L));
    }
}
