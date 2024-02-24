import java.util.*;

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


    /*
    @description 12. Integer to Roman
    @author jsr1611
    @reference https://leetcode.com/problems/integer-to-roman/
     */
    public String intToRoman(int num){
        StringBuilder result = new StringBuilder();
        Map<Integer, String> romans = new TreeMap<>();
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");

        List<Integer> keys = new ArrayList(romans.keySet());
        Collections.reverse(keys);
        int pref = 0;
        while (num > 0){
            for (Integer key : keys) {
                if(num >= key){
                    pref = num / key;
                    while (pref > 0){
                        result.append(romans.get(key));
                        pref--;
                    }
                    num %= key;
                }
            }
        }
        return result.toString();
    }

}
