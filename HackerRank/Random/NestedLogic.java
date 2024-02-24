package HackerRank;/*
Author: Jumanazar Saidov
Date: 2021.11.10
Link: https://www.hackerrank.com/challenges/30-nested-logic/problem
 */
import java.io.*;
import java.util.*;

public class NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine(); // return date
        String st2 = sc.nextLine(); // due date
        String[] dr1 = st1.split(" ");
        String[] dd1 = st2.split(" ");
        int[] dr = new int[dr1.length];
        int[] dd = new int[dd1.length];
        int totalDiffDays = 0;
        int totalDiffMon = 0;
        int totalDiffYear = 0;
        int totalHackos = 0;
        for(int i=0; i < dr.length; i++){
            dr[i] = Integer.parseInt(dr1[i]);
            dd[i] = Integer.parseInt(dd1[i]);

        }

        totalDiffDays += (dr[0] - dd[0]);
        totalDiffMon += (dr[1] - dd[1]);
        totalDiffYear += (dr[2] - dd[2]);

        if(totalDiffYear == 0){
            if(totalDiffMon == 0){
                totalHackos = totalDiffDays * 15;
            }
            else if(totalDiffMon > 0){
                totalHackos = 500 * totalDiffMon;
            }
        }
        else if(totalDiffYear > 0){
            totalHackos = 10000;
        }
        System.out.println(totalHackos);
    }
}
