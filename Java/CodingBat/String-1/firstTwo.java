
/*
Author: Jumanazar Saidov
Date: 2021.11.11
Link: https://codingbat.com/prob/p163411
 */

public class firstTwo {
    public String firstTwo(String str) {
        if(str.length() > 2){
            str = str.substring(0,2);
        }
        return str;
    }
}
