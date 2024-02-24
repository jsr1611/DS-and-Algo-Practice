/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p192082
Date: 2021-10-29
 */

public boolean icyHot(int temp1, int temp2) {
    return ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100));
}
