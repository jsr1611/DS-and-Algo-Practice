package Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Direction arrays for 8 directions (row-wise and column-wise movement)
    private static final int[] DX = {-1, -1, -1, 0, 0, 1, 1, 1}; // Row direction
    private static final int[] DY = {-1, 0, 1, -1, 1, -1, 0, 1}; // Column direction

    public static void main(String[] args) {
        System.out.println(solve(1));
    }


    private static long solve(int partNumber) {
        String fileName = "AdventOfCode/2025/Day4/input.txt";
        long totalCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File Content:");
            Boolean flag = null;
            List<char[]> gridList = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                char[] arr = line.toCharArray();
                gridList.add(arr);
                for (char c : arr) {
                    System.out.print(c + ".");
                }
                System.out.println();
            }
            char[][] grid = gridList.toArray(new char[0][]);
            totalCount = countOccurrences(grid, "XMAS");
            return totalCount;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalCount;
    }


    public static int countOccurrences(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // Iterate over every cell in the grid
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Check for the word in all 8 directions
                for (int direction = 0; direction < 8; direction++) {
                    if (searchInDirection(grid, word, row, col, direction)) {
                        count++; // Increment count if a match is found
                    }
                }
            }
        }

        return count; // Return total count
    }

    private static boolean searchInDirection(char[][] grid, String word, int row, int col, int direction) {
        int rows = grid.length;
        int cols = grid[0].length;
        int wordLen = word.length();

        // Check each character of the word
        for (int i = 0; i < wordLen; i++) {
            int newRow = row + i * DX[direction];
            int newCol = col + i * DY[direction];

            // If out of bounds or character does not match, return false
            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || grid[newRow][newCol] != word.charAt(i)) {
                return false;
            }
        }

        return true; // Word matches in the given direction
    }
}
