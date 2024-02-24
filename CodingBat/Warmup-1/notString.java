/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p191914
Date: 2021-10-27
 */

public String notString(String str) {
    if(str.startsWith("not")){
        return str;
    }
    else{
        return "not "+str;
    }
}
