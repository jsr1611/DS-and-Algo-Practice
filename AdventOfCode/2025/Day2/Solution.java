package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        int safeReports = solve(1);
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
                int curr = Integer.parseInt(nums[0]);
                int next = Integer.parseInt(nums[1]);
                Boolean flag = true;    //true: ASC, false: DESC
                Boolean safe = true;
                if(curr == next) {
                    continue;
                }
                else if(curr > next) {
                    if(curr - next > 3) continue;
                    flag = false;
                }
                else {
                    if(next - curr > 3) continue;
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
}
