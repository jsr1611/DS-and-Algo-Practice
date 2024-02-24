/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p165701
Date: 2021-10-29
 */

public boolean loneTeen(int a, int b) {
    boolean case1 = (a >= 13 && a <= 19 && (b < 13 || b > 19));
    boolean case2 = ((a < 13 || a > 19) && b >= 13 && b <= 19);;

    return case1 || case2;
}
