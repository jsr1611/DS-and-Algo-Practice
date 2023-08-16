import java.util.HashSet;
import java.util.Set;

public class Day007 {
    /*
    @description 2520. Count the Digits That Divide a Number
    @author jsr1611
    @reference https://leetcode.com/problems/count-the-digits-that-divide-a-number/
     */
    public int countDigits(int num){
        if(num < 10) return 1;
        int count = 0;
        int cpNum = num;
        int length = (num + "").length();
        int sufNum = 0;

        while (length > 0){
            sufNum = cpNum % 10;
            if(num % sufNum == 0){
                count++;
            }
            cpNum /= 10;
            length--;
        }
        return count;
    }
}
