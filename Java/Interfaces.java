/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://www.hackerrank.com/challenges/30-interfaces/problem?h_r=next-challenge&h_v=zen
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int total = 0;
        for(int i=1; i < n+1; i++){
            if(n % i == 0){
                total+= i;
            }
        }
        return total;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}