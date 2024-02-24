/*
Author: Jumanazar Saidov
Date: 2021.11.04
Link: https://codingbat.com/prob/p159531
 */

public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend){
        return cigars >= 40;
    }
    else{
        return (cigars >= 40 && cigars <= 60);
    }
 }