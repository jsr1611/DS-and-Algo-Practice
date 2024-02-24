/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/05 08:13
 * desc: You’re given a string s containing letters of three types, R, B, and ..
 *
 * R represents your current position, B represents a blocked position, and . represents an empty position.
 * In one step, you can move to any adjacent position to your current position, as long as it is empty.
 * Can you reach either the leftmost position or the rightmost position?
 *
 * Return true if you can reach either the leftmost or the rightmost position, or false if you cannot.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 */

public class RookieMistake {
    public boolean solve(String s) {
        int initialB = s.indexOf("B");
        int mine = s.indexOf("R");
        int lastB = s.lastIndexOf("B");
        return initialB < 0 || mine <= initialB || lastB <= mine;
    }
}
