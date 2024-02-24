/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p100905
Date: 2021-10-29
 */

public String delDel(String str) {
    String res = "";
    if(str.length() > 0){
        boolean del = str.substring(1).startsWith("del");
        res = del ? str.substring(0,1) + str.substring(4) : str;
    }
    return res;
}
