/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p196441
Date: 2021-10-29
 */

public String everyNth(String str, int n) {
    String res = "";
    for(int i = 0; i < str.length(); ){
        res = res + str.substring(i, i+1);
        i+=n;
    }
    return res;
}
