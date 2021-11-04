/*
Author: Jumanazar Saidov
Date: 2021.11.04
Link: https://codingbat.com/prob/p165312
 */

public String doubleChar(String str) {
    String result = "";
    for(int i=0;i < str.length(); i++){
        result+= str.substring(i, i+1).concat(str.substring(i, i+1));
    }
    return result;
}
