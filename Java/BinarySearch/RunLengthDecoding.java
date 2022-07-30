/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/31 03:34
 * desc: Given a string s, consisting of digits and lowercase alphabet characters, that's a run-length encoded string,
 * return its decoded version.
 *
 * Note: The original string is guaranteed not to have numbers in it.
 *
 * Constraints
 *
 * 0 ≤ n ≤ 100,000 where n is the length of s
 */

public class RunLengthDecoding {
    public static void main(String[] args) {
        System.out.println(solve("3m4n5j1v10c"));
    }
    public static String solve(String s) {
        if(s.length() < 2) return s;
        StringBuilder result = new StringBuilder();
        String sub = "";
        int num = 0;
        int numLength;
        for(int i=0; i < s.length();){
            numLength=0;
            while ((numLength+i) < s.length() && Character.isDigit(s.charAt(i+numLength))) {
                numLength++;
            }
            num = Integer.parseInt(s.substring(i, i+numLength));
            sub = s.substring(i+numLength, i+numLength+1);
            result.append(fill(num, sub));
            i+= (numLength + 1);
        }
        return result.toString();
    }
    private static String fill(int num, String s){
        StringBuilder res = new StringBuilder();
        for(int i=0; i < num; i++){
            res.append(s);
        }
        return res.toString();
    }
}
