/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p178318
 */

public int last2(String str) {
    String last2 = str;
    if(str.length()>2){
        last2 = str.substring(str.length()-2);
    }
    int count = 0;
    for(int i =0; i < str.length()-2; i++){
        if(str.substring(i,i+2).equals(last2)){
            count++;
        }
    }
    return count;
}
