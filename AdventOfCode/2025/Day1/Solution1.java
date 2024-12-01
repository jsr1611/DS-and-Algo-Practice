import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * https://adventofcode.com/2024/day/1#
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("Total distance: " + solve());
    }

    private static long solve() {
        String fileName = "AdventOfCode/2025/Day1/input.txt";
        long totalCount = 0;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                String[] nums = line.split("   ");
                leftList.add(Integer.parseInt(nums[0]));
                rightList.add(Integer.parseInt(nums[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.sort(leftList);
        Collections.sort(rightList);
        System.out.println(leftList.get(0) + " " + rightList.get(0));
        System.out.println("smallest...done");
        System.out.println(leftList.get(rightList.size()-1) + " " + rightList.get(rightList.size()-1));
        System.out.println("largest...done");
        int start = 0, end = leftList.size()-1;
        while (start <= end){
            totalCount += Math.abs(leftList.get(start) - rightList.get(start));
            System.out.printf("No: %d %d += ABS (%d - %d)\n",start, totalCount, leftList.get(start), rightList.get(start));
            totalCount += Math.abs(leftList.get(end) - rightList.get(end));
            System.out.printf("No: %d %d += ABS (%d - %d)\n",end, totalCount, leftList.get(end), rightList.get(end));
            start++;
            end--;
        }
        return totalCount;
    }
}
