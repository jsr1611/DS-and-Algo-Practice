/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/15
 * Question 2 out of 3. Toptal online coding
 * desc:
 *       From an integer X representing a time duration in seconds produce a simplified string representation.
 *       For example, given
 *       100
 *       You should output:
 *       "1m40s"
 *       Use the following abbreviations w,d,h,m,s to represent:
 *       * 1w is 1 week
 *       * 1d is 1 day
 *       * 1h is 1 hour
 *       * 1m is 1 minute
 *       * 1s is 1 second
 *       Only the two largest non-zero units should be used. Round up the second unit if necessary so that
 *       the outupt only has two units even though this might meean the output is for slightly more time than X seconds.
 *       Write a function
 *           class Solution{ public String solution(int X); }
 *       that, given an integer X, return a string representing the duration.
 *       Examples:
 *       1. Given X=100, return "1m40s"
 *       2. Given X=7263, return "2h2m"
 *       3. Given X=5, return "5s"
 */


public class IntegerTimeInString {
    public static void main(String[] args) {
        System.out.println(new IntegerTimeInString().solution(7263));
    }
    public String solution(int X) {
        // write your code in Java SE 8
        String result = "";
        int seconds = 0;
        int minute = 60, mins = 0;
        int hour = minute * 60, hours = 0;
        int day = hour * 24, days = 0;
        int week = day * 7, weeks = 0;
        while (X > 0){
            if(X > week){
                weeks = X / week;
                X = X - weeks * week;
                result = String.format("%dw", weeks);
            }else if(X > day){
                days = X / day;
                X = X - days * day;
                result = result.concat(String.format("%d", days)+"d");
            }
            else if(X > hour){
                hours = X / hour;
                X = X - hours * hour;
                if(result.contains("w") && result.contains("d")){
                    String w = result.substring(0, result.indexOf("w"));
                    int d = Integer.parseInt(result.substring(result.indexOf("w")+1, result.indexOf("d")));
                    return w + "w" + (++d)+"d";
                }else {
                    result = result.concat(String.format("%d", hours)+"h");
                }
            }
            else if(X > minute){
                mins = X / minute;
                X = X - mins * minute;
                if(result.contains("w") && result.contains("d")
                ) {
                    String w = result.substring(0, result.indexOf("w"));
                    int d = Integer.parseInt(result.substring(result.indexOf("w")+1, result.indexOf("d")));
                    return w + "w" + (++d)+"d";
                }
                else if(result.contains("d") && result.contains("h")){
                    String d = result.substring(0, result.indexOf("d"));
                    int h = Integer.parseInt(result.substring(result.indexOf("d") + 1, result.indexOf("h")));
                    return d + "d" + (++h) + "h";
                }else {
                    result = result.concat(String.format("%d", mins) + "m");
                }
            }
            else {
                seconds = X;

                if(result.length() > 4){
                    String w = "", d = "", h = "", m = "";
                    if(result.contains("w")){
                        w = result.substring(0, result.indexOf("w"));
                        result = result.substring(result.indexOf("w")+1  );
                    }
                    if(result.contains("d")){
                        d = result.substring(0, result.indexOf("d"));
                        result = result.substring(result.indexOf("d")+1);
                    }
                    if(result.contains("h")){
                        h = result.substring(0, result.indexOf("h"));
                        result = result.substring(result.indexOf("h")+1);
                    }
                    if(result.contains("m")){
                        m = result.substring(0, result.indexOf("m"));
                    }
                    String finalStr  = "";
                    if(w.length() > 0){
                        finalStr = w + "w";
                    }
                    if(d.length() > 0){
                        if(finalStr.length() > 0){
                            return finalStr + (Integer.parseInt(d) + 1) + "d";
                        }
                        else {
                            finalStr = d + "d";
                        }
                    }
                    if(h.length() > 0){
                        if(finalStr.length() > 0){
                            return finalStr + (Integer.parseInt(h) + 1) + "h";
                        }else {
                            finalStr = h + "h";
                        }
                    }
                    if(m.length() > 0){
                        if(finalStr.length() > 0){
                            return finalStr + (Integer.parseInt(m) + 1) + "m";
                        }
                        return m + "m" + X + "s";
                    }

                }
                else {
                    result = result.concat(seconds+"s");
                }
                X = 0;
            }
        }
        return result;
    }
}