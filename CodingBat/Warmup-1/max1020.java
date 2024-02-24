/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p177372
Date: 2021-10-29
 */

public int max1020(int a, int b) {
    int larger = a > b ? a : b;
    boolean largerIn = larger >= 10 && larger <= 20;
    int smaller = a < b ? a : b;
    boolean smallerIn = smaller >= 10 && smaller <= 20;
    return  largerIn ? larger : (smallerIn ? smaller : 0);
}
