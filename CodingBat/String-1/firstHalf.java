
/*
Author: Jumanazar Saidov
Date: 2021.11.11
Link: https://codingbat.com/prob/p172267
 */

public class firstHalf {
    public String firstHalf(String str) {
        int len = str.length();
        if(len > 1){
            str = str.substring(0, len/2);
        }
        return str;
    }
}
