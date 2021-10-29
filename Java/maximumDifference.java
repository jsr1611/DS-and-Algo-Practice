/*
Author: Jumanazar Saidov
Date: 2021-10-29
Definition:
   The absolute difference between two integers, a and b, is written as |a-b|.
   The maximum absolute difference between two integers in a set of positive integers,elements ,
   is the largest absolute difference between any two integers in __elements.
   link: https://www.hackerrank.com/challenges/30-scope/problem
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] __elements){
        this.elements = __elements;
    }

    public void computeDifference(){
        if(elements.length==1 ){maximumDifference = elements[0];}
        else if(elements.length>1){
            maximumDifference = elements[1] - elements[0];
            for(int i=0; i < elements.length; i++){
                for(int j = 1+i;j < elements.length; j++){
                    if(maximumDifference < Math.abs(elements[j]-elements[i])){
                        maximumDifference = Math.abs(elements[j]-elements[i]);
                    }
                }
            }
        }

    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}