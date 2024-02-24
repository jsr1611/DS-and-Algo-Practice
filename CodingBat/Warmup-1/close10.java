/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p172021
Date: 2021-10-29
 */

public int close10(int a, int b) {
    int distance1 = a > 10 ? a - 10 : 10 - a;
    int distance2 = b > 10 ? b - 10 : 10 - b;
    if(distance1 == distance2 && (a == 10 ^ b == 10)){      // applying exclusive OR (XOR) operator to get only one true
        return 10;
    }
    else{
        if(distance1 == distance2){
        return 0;
        }
        else{
            return distance1 > distance2 ? b : a;
        }
    }
}
