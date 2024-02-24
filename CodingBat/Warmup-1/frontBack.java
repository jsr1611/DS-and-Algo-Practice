/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p123384
Date: 2021-10-27
 */
public String frontBack(String str) {
    if(str.length()>1){
        return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0,1);
    }
    return str;
}
