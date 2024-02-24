/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p125268
Date: 2021-10-29
 */

public String endUp(String str) {
    if(str.length()<=3){
        return str.toUpperCase();
    }
    else{
        return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }
}
