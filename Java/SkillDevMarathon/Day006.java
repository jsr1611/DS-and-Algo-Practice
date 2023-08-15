import java.util.HashMap;
import java.util.Map;

public class Day006 {
    /*
    @description 13. Roman to Integer
    @author jsr1611
    @reference https://leetcode.com/problems/roman-to-integer/
     */
    public int romanToInt(String s){
        Map<String, Integer> singles = new HashMap<>();
        singles.put("I", 1);
        singles.put("V", 5);
        singles.put("X", 10);
        singles.put("L", 50);
        singles.put("C", 100);
        singles.put("D", 500);
        singles.put("M", 1000);

        Map<String, Integer> doubles = new HashMap<>();
        doubles.put("IV", 4);
        doubles.put("IX", 9);
        doubles.put("XL", 40);
        doubles.put("XC", 90);
        doubles.put("CD", 400);
        doubles.put("CM", 900);
        int index = 0, result = 0, length = s.length();

        while(index < length){
            if(index + 1 < length && doubles.containsKey(s.substring(index, index+2))){
                result += doubles.get(s.substring(index, index+2));
                index += 2;
            }
            else {
                result += singles.get(s.substring(index,index+1));
                index += 1;
            }
        }

        return result;
    }
}
