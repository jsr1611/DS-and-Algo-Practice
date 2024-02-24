/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p165666
 */

public String stringBits(String str) {
    String result = "";
    for(int i=0; i < str.length();){
        result += str.substring(i,i+1);
        i+=2;
    }
    return result;
}
