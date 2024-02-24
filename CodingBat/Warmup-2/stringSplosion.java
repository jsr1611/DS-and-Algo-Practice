/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p117334
 */

public String stringSplosion(String str) {
    String result = str;
    for(int i=0; i < str.length(); i++){
        result = str.substring(0, str.length()-i-1) + result;
    }
    return result;
}
