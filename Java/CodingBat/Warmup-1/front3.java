/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p136351
Date: 2021-10-29
 */
public String front3(String str) {
    if(str.length() > 3){
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
    else{
        return str + str + str;
    }
}