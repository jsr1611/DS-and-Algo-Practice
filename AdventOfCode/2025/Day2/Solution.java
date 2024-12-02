package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        int safeReports = solve(1);
        int safeReports = solve(2);
        System.out.println((safeReports > 0 ? safeReports + " reports are safe" : " No safe reports"));
    }

    private static int solve(int partNumber) {
        String fileName = "AdventOfCode/2025/Day2/input.txt";
        int totalCount = 0;
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                String[] nums = line.split(" ");
                counter++;
                //part 1
                boolean safe = isValid(nums);
                //part 2
                if(partNumber == 2){
                    int countDown = nums.length;
                    while(!safe && --countDown >= 0){
                        String[] numArr = removeOneNumber(nums, countDown);
                        safe = isValid(numArr);
                    }
                }
                if(safe)
                    totalCount += 1;
                System.out.println(String.format("No %d totalCount: %d, numbers: %s, %b", counter, totalCount, String.join(" ", nums), safe));
            }
            return totalCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalCount;
    }

    private static String[] removeOneNumber(String[] arr, int index){
        List<String> nums = new ArrayList<>(List.of(arr));
        nums.remove(index);
        return nums.toArray(new String[0]);
    }

    private static boolean isValid(String[] nums){
        int curr = Integer.parseInt(nums[0]);
        int next = Integer.parseInt(nums[1]);
        Boolean flag = true;    //true: ASC, false: DESC
        Boolean safe = true;
        if(curr == next) {
            return false;
        }
        else if(curr > next) {
            if(curr - next > 3) return false;
            flag = false;
        }
        else {
            if(next - curr > 3) return false;
        }

        for (int k = 1; k < nums.length-1; k++) {
            curr = Integer.parseInt(nums[k]);
            next = Integer.parseInt(nums[k+1]);

            if(flag){ // ASC
                if(curr < next && (next - curr) > 0 && (next - curr) < 4){
                    continue;
                }
                safe = false;
                break;
            }else { //DESC
                if(curr > next && (curr - next) > 0 && (curr - next) < 4){
                    continue;
                }
                safe = false;
                break;
            }
        }
        return safe;
    }
}
