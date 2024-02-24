/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p125339
Date: 2021-10-29
 */

public boolean lastDigit(int a, int b) {
    int bigger = a > b ? a : b;
    int smaller = a < b ? a : b;
    return bigger % 10 == smaller;
}
