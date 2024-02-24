/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p171260
 */

public String stringX(String str) {
    String result = str;
    for(int i=1; i < result.length()-1; i++){
        if(result.charAt(i) == 'x'){
            result = result.substring(0, i) + result.substring(i+1);
            i-=1;
        }
    }
    return result;
}
