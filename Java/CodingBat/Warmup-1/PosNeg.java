/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p159227
Date: 2021-10-27
 */

public boolean posNeg(int a, int b, boolean negative) {
    if(!negative){
        return (a>0 && b<0) || (a<0 && b>0);
    }
    else
    {
        return (a<0 && b<0);
    }

}
