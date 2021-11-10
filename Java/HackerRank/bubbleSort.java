package HackerRank;

/*
Author: Jumanazar Saidov
Date: 2021.11.03
Definition: BubbleSort algorithm implementation
Link: https://www.hackerrank.com/challenges/30-sorting/problem
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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int numSwaps = 0;
        for(int i=0; i < a.size(); i++){
            int swaps = 0;
            for(int j=0; j < a.size()-1; j++){
                if(a.get(j) > a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    swaps++;
                }
            }

            if(swaps == 0){
                break;
            }
            numSwaps += swaps;
        }
        System.out.printf("Array is sorted in %d swaps.\n", numSwaps);
        System.out.printf("First Element: %d\n", a.get(0));
        System.out.printf("Last Element: %d\n", a.get(a.size()-1));

        bufferedReader.close();
    }
}
