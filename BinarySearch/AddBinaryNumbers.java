/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/26 16:20
 * desc: Given two strings a and b that represent binary numbers, add them and return their sum, also as a string.
 * The input strings are guaranteed to be non-empty and contain only 1s and 0s.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of a
 * m ≤ 100,000 where m is the length of b
 */

public class AddBinaryNumbers {
    public static void main(String[] args) {
        System.out.println(new AddBinaryNumbers().solve("1", "1"));
        // result should be: "10"
    }
    public String solve(String a, String b) {
        int i = a.length()-1, j = b.length()-1, carry = 0;
        StringBuilder result = new StringBuilder();
        int sum;
        while (i >= 0 || j >= 0 || carry > 0){
            sum = carry;
            sum += ((i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0);
            sum += ((j>=0) ? Character.getNumericValue(b.charAt(j)) : 0);
            if(sum > 2){
                sum = 1;
                carry = 1;
            }else{
                carry = sum == 2 ? 1 : 0;
                sum = sum == 2 ? 0 : sum;
            }
            result.append(sum);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
