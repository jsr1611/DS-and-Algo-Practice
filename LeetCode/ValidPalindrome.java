/**
 * description: 125. Valid Palindrome
 * author: jumanazar
 * created: 08/10/25
 * link: https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(end);
            if (currFirst >= 'A' && currFirst <= 'Z') {
                currFirst = (char) (currFirst + 32);
            }
            if (currLast >= 'A' && currLast <= 'Z') {
                currLast = (char) (currLast + 32);
            }
            if (!((currFirst >= 'a' && currFirst <= 'z') || (currFirst >= '0' && currFirst <= '9'))) {
                start++;
                continue;
            }
            if (!((currLast >= 'a' && currLast <= 'z') || (currLast >= '0' && currLast <= '9'))) {
                end--;
                continue;
            }
            if (currFirst != currLast) return false;
            start++;
            end--;
        }

        return true;
    }
}
