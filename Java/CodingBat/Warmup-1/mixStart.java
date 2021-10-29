/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p151713
Date: 2021-10-29
 */

public boolean mixStart(String str) {
    boolean res = false;
    if(str.length()>=3){
        if(str.substring(1).startsWith("ix")){
            res = true;
        }
    }
    return res;
}
