/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/25 14:36
 * desc: Given a non-negative integer num, convert it to an English number word as a string. num will be less than one trillion.
 */

public class IntegerToEnglish {
    String[] ones = {"Zero", "One", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] hundreds = {"hundred", "thousand", "million", "billion"};
//    Integer[] ones_n = {0, 1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15,16,17,18,19};
//    Integer[] tens_n = {10,20,30,40,50,60,70,80,90};
    Integer[] hundreds_n = {100,1000,1000_000, 1000_000_000};
    public static void main(String[] args) {
        System.out.println(new IntegerToEnglish().solve(1353100335));
    }
    public String solve(int num) {
        String res = "";
        int temp = 0;
        if(num == 0) return ones[0];
        if(num >= hundreds_n[3]){               // billion
            temp = num / hundreds_n[3];
            if(temp >= 100){
                res = getHundreds(temp) + " " + hundreds[3];
            }else {
                res = getTens(temp) + " " + hundreds[3];
            }
            num %= hundreds_n[3];
        }
        if(num>= hundreds_n[2]){                // million
            temp = num / hundreds_n[2];
            if(temp >= 100){
                res += (" "+getHundreds(temp) +" "+ hundreds[2]);
            }else {
                res += (" "+getTens(temp) +" "+ hundreds[2]);
            }
            num %= hundreds_n[2];
        }
        if(num>=hundreds_n[1]){                 //thousand
            temp = num / hundreds_n[1];
            if(temp>=100){
                res += (" " + getHundreds(temp) + " " + hundreds[1]);
            }
            else {
                res += (" " + getTens(temp) + " " + hundreds[1]);
            }
            num %= hundreds_n[1];
        }
        if(num >= hundreds_n[0]){                 // hundred
            res += " "+ getHundreds(num);
        }else {                              //ten
            res += (" " + getTens(num));
        }
        return res.trim();
    }

    private String getHundreds(int num){
        int temp = num / 100;
        return ones[temp] + " " + hundreds[0] + (num%100 == 0 ? "": (" " +getTens(num%100)));
    }
    private String getTens(int num){
        int temp;
        if(num>19){
            temp = num / 10;
            return tens[temp-1] + (num%10 == 0 ? "": (" " + getTens(num%10)));
        }else {
            return num == 0 ? "" : ones[num];
        }
    }

}
