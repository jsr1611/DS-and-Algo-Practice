package HackerRank;/*
Author: Jumanazar Saidov
Date: 2021.11.06
Link: https://www.hackerrank.com/challenges/valid-username-checker/problem
 */
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z$]\\w{7,29}$";
    //LINK: https://www.geeksforgeeks.org/how-to-validate-a-username-using-regular-expressions-in-java/
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}