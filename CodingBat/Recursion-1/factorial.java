/*
Author: Jumanazar Saidov
Date: 2021.11.04
Link: https://codingbat.com/prob/p154669
 */

public int factorial(int n) {
    if(n == 1){
        return n;
    }
    return n * factorial(--n);
}