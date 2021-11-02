/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p186759
 */

boolean doubleX(String str) {
    int nextIndex = str.indexOf("x") + 1;
    if(str.length() > (nextIndex) && str.charAt(nextIndex) == 'x'){
        return true;
    }
    return false;
}
