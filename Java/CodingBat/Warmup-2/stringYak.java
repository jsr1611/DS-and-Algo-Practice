/*
Author: Jumanazar Saidov
Date: 2021.11.03
Link: https://codingbat.com/prob/p126212
 */

public String stringYak(String str) {
    for(int i=0; i < str.length()-2;i++){
        if(str.length() >= (i+3) && str.substring(i,i+3).equals("yak")){
            str = str.substring(0,i) + str.substring(i+3);
            i-=1;
        }
    }
    return str;
}
