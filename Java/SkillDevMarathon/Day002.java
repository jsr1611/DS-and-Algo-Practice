public class Day002 {

    /*
        @description Problem 9. Palindrome Number
        @author jsr1611
        @reference https://leetcode.com/problems/palindrome-number/description/
     */
    public boolean isPalindrome(int x) {
        String num = x+"";
        int len = num.length();
        if(len == 1 )
            return true;
        else if(len == 2)
            return num.charAt(0) == num.charAt(1);
        for(int i=0; i < len/2; i++){
            if(num.charAt(i) != num.charAt(len-1-i)){
                return false;
            }
        }
        return Long.parseLong("111") > Long.parseLong("111");
        //return true;
    }


    /*
    @description 7. Reverse Integer
    @author jsr1611
    @reference https://leetcode.com/problems/reverse-integer/description/
     */
    public int reverse(int x) {
        long res = 0;
        boolean negative = x < 0;
        int num = negative ? x * (-1) : x;
        while(num > 0){
            res = (res * 10 + num % 10);
            num /= 10;
        }
        if(negative)
            res = (-1) * res;
        if(res < (long)Integer.MIN_VALUE || res > (long)Integer.MAX_VALUE) return 0;
        return (int)res;
    }



}
