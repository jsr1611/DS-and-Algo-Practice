/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p183592
Date: 2021-10-29
 */

public String front22(String str) {
    String res = "";
    if(str.length()>2){
        res = str.substring(0,2) + str + str.substring(0,2);
    }
    else{
        res = str + str + str;
    }
    return res;
}
