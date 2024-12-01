import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * https://adventofcode.com/2024/day/1#part2
 */
public class Solution1 {
    public static void main(String[] args) {
//        System.out.println("Total distance: " + solve(1));
        System.out.println("Total similarity score: " + solve(2));
    }

    private static long solve(int partNumber) {
        String fileName = "AdventOfCode/2025/Day1/input.txt";
        long totalCount = 0;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        Map<Integer, Integer> rightListCount = new HashMap<>();
        int key = 0, value = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                String[] nums = line.split("   ");

                key = Integer.parseInt(nums[0]);
                leftList.add(key);

                key = Integer.parseInt(nums[1]);
                rightList.add(key);

                if(rightListCount.containsKey(key)){
                    value = rightListCount.get(key);
                    rightListCount.put(key, value + 1);
                }
                else {
                    rightListCount.put(key, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // part 1
        if(partNumber == 1){
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
        }else { // part 2
            int count = 0;
            while (count < leftList.size()){
                key = leftList.get(count);
                if(rightListCount.containsKey(key)){
                    totalCount += key * rightListCount.get(key);
                    System.out.printf("No: %d, %d += %d * %d times\n",count, totalCount, key, rightListCount.get(key));
                }else {
                    System.out.printf("No: %d, %d += %d * %d times\n",count, totalCount, key, rightListCount.get(key));
                }
                count++;
            }
        }

        return totalCount;
    }
}
