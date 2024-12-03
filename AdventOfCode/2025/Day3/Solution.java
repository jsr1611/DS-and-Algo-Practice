package Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static int counter;
    public static void main(String[] args) {
        counter = 0;
//        System.out.println(solve(1));
//        counter = 0;
        System.out.println(solve(2));
    }

    private static long solve(int partNumber) {
        String fileName = "AdventOfCode/2025/Day3/input.txt";
        long totalCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            Boolean flag = null;
            while ((line = reader.readLine()) != null) {
                if(partNumber == 2) { //part 2
                    StringBuilder sb = new StringBuilder();
                    String[] dondonts = line.split("(?=don't\\(\\))|(?=do\\(\\))");
                    for (String extract : dondonts) {
                        if(extract.startsWith("don't()") || (flag != null && !flag && !extract.startsWith("do()"))){
//                            System.out.println("DONTS [" + flag + "]  " + extract);
                            flag = false;
                        }else {
//                            System.out.println("DOS:  ["+flag+"]  " + extract);
                            flag = true;
                            sb.append(extract);
                        }
                    }
                    line = sb.toString();
                }
                totalCount += mul(line); // part 1

            }
            return totalCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalCount;
    }

    private static long mul(String line){
        long totalCount = 0;
        Pattern pattern = Pattern.compile("mul\\(\\d{1,3},\\d{1,3}\\)");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String mul = matcher.group();   //mul(num1,num2)
            Pattern numPattern = Pattern.compile("\\d{1,3}");
            Matcher mulMatcher = numPattern.matcher(mul);
            List<Integer> nums = new ArrayList<>();
            while (mulMatcher.find()) {
                nums.add(Integer.parseInt(mulMatcher.group())); //num
            }
            counter++;
            totalCount += (nums.get(0) * nums.get(1));
            System.out.println(String.format("No %d totalCount: %d, numbers: %d, %d", counter, totalCount, nums.get(0), nums.get(1)));
        }
        return totalCount;
    }
}
