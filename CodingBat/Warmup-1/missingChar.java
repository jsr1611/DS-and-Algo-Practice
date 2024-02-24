/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p190570
Date: 2021-10-27
 */

public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n+1);
}
