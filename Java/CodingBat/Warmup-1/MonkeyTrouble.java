/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p181646
Date: 2021-10-26
 */

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return ((aSmile && bSmile) || (!aSmile && !bSmile));
        //return (aSmile == bSmile); // same as above, but more smart
}
