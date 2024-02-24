/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p198640
 */

public int stringMatch(String a, String b) {
    int len = a.length() > b.length() ? b.length() : a.length();
    int count = 0;
    for(int i=0; i < len-1; i++){
        if(a.substring(i,i+2).equals(b.substring(i,i+2))){
            count++;
        }
    }
    return count;
}
