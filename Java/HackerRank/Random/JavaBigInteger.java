/**
 In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 Use the power of Java's BigInteger class and solve this problem.

 Input Format
 There will be two lines containing two numbers, a and b.

 Constraints
 a and b are non-negative integers and can have maximum 200 digits.

 Output Format
 Output two lines. The first line should contain a+b, and the second line should contain a x b . Don't print any leading zeros.

 Sample Input
 1234
 20

 Sample Output
 1254
 24680

 Explanation
 1234 + 20 = 1254
 1234 x 20 = 24680

 link: https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
 */
import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String as = sc.next();
        String bs = sc.next();
        BigInteger a = new BigInteger(as);
        BigInteger b = new BigInteger(bs);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
