
/*
Author: Jumanazar Saidov
Date: 2021.11.11
Link: https://codingbat.com/prob/p108853
 */

public class extraEnd {
    public String extraEnd(String str) {
        if(str.length() > 2){
            str = str.substring(str.length() - 2);
        }
        return str + str + str;
    }
}
