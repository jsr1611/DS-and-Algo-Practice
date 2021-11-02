/*
Author: Jumanazar Saidov
Date: 2021.11.01
Link: https://www.hackerrank.com/challenges/30-more-exceptions/problem?h_r=next-challenge&h_v=zen
 */
import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    int power(int n, int p) throws Exception{
        int res = 1;
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            for(int i=0; i < p; i++){
                res = res * n;
            }
        }
        return res;
    }

}

class Solution{