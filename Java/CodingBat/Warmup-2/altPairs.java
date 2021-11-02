/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p121596
 */

public String altPairs(String str) {
    String result = "";
    for(int i=0; i < str.length(); i+= 4){
        int len = i + 2;
        if(str.length() < (i+2)){
            len = str.length();
        }
        result += str.substring(i, len);
    }
    return result;
}
