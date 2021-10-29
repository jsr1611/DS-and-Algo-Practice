/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p173784
Date: 2021-10-29
 */

public boolean stringE(String str) {
    int eCount = 0;
    for(int i=0; i < str.length(); i++){
        if(str.substring(i,i+1).equals("e")){
            eCount++;
        }
    }
    return eCount>=1 && eCount <= 3;
}
