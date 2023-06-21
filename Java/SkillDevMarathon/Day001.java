public class Day001 {
    /*
        Day 1
        Problem 1: 2413. Smallest Even Multiple (https://leetcode.com/problems/smallest-even-multiple/)
        Prpblem 2: 2396. Strictly Palindromic Number (https://leetcode.com/problems/strictly-palindromic-number/)
     */
    public int smallestEvenMultiple(int n) {
        // Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
        return n % 2 == 0 ? n : n * 2;
    }

    public boolean isStrictlyPalindromic(int n) {
        return false;
    }

}
