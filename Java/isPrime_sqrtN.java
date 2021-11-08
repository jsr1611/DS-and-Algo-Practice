/*
Author: Jumanazar Saidov
Date: 2021.11.08
Link: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
Helpfull resource: https://stackoverflow.com/a/2385999/10227421
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int k=0; k < number; k++){
            int N = scanner.nextInt();
            boolean prime = true;
            //bruteForceSolution!
             /*
             for(int i = 2; i < N;){
                 if(N % i == 0){
                     System.out.println("Not prime");
                     prime = false;
                     break;
                 }
                 if(i % 2 != 0 && i % 3 != 0){
                     i+=2;
                 }
                 else
                 {
                     i++;
                 }
             }
             if(prime){
                 System.out.println("Prime");
             }
              */
            // OptimizedSolution!
            if(N < 2) prime = false;
            if(N == 2 || N == 3) prime = true;
            if((N%2 == 0 || N%3 == 0) && N > 3) prime = false;
            long sqrtN = (long)Math.sqrt(N)+1;
            for(long i = 6L; i <= sqrtN; i += 6) {
                if(N%(i-1) == 0 || N%(i+1) == 0) prime = false;
            }
            if(prime) {
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}
