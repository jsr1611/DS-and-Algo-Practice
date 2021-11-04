/*
Author: Jumanazar Saidov
Date: 2021.11.04
Link: https://www.hackerrank.com/challenges/one-month-preparation-kit-time-conversion/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&utm_campaign=email_campaign&utm_medium=email&utm_source=email
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0,2));
        if(s.contains("AM")){
            if(hour == 12){
                s = "00" + s.substring(2, s.length()-2);
            }
            else{
                s = s.substring(0, s.length()-2);
            }
        }
        else{
            if(hour != 12){
                hour += 12;
                s = hour + s.substring(2, s.length()-2);
            }
            else{
                s = s.substring(0, s.length()-2);
            }
        }
        return s;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
