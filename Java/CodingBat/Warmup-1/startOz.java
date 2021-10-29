/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p199720
Date: 2021-10-29
 */

public String startOz(String str) {
    String res = "";
    if(str.length() >= 1 && str.substring(0,1).equals("o")){
        res = "o";
    }
    if(str.length() >= 2 && str.substring(1,2).equals("z")){
        res = res + "z";
    }
    return res;
}
