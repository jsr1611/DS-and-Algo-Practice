/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p101887
Date: 2021-10-29
 */

public int intMax(int a, int b, int c) {
    int max = a > b ? a : b;
    max = max > c ? max : c;
    return max;
}