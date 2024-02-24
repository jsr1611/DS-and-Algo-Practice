/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p194667
 */

int countXX(String str) {
    int count = 0;
    for(int i=0; i < str.length()-1; i++){
        if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
            count++;
        }
    }
    return count;
}
