/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p101475
 */

public String frontTimes(String str, int n) {
    String res = "";
    if(str.length() > 3){
        str = str.substring(0,3);
    }
    while(n-- >0){
        res += str;
    }
    return res;
}
