package HackerRank;

/*
Author: Jumanazar Saidov
Date: 2021.11.06
Link: https://www.hackerrank.com/challenges/duplicate-word/problem
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
        link: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
        link2:https://farenda.com/java/java-regex-remove-duplicated-words/
         */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {

                input = input.replaceAll(m.group(), m.group(1));
            }
            // Prints the modified sentence.

            System.out.println(input);
        }

        in.close();
    }
}