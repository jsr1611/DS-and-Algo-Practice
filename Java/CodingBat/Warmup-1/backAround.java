/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p161642
Date: 2021-10-29
 */

public String backAround(String str) {
    return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
}
