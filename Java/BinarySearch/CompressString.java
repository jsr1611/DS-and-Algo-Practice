/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/26 18:19
 * desc: Given a string lowercase alphabet s, eliminate consecutive duplicate characters from the string and return it.
 * That is, if a list contains repeated characters, they should be replaced with a single copy of the character.
 * The order of the elements should not be changed.
 *
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of s
 *
 * Example
 *
 * Input
 * s = "aaaaaabbbccccaaaaddf"
 * Output
 * "abcadf"
 */

public class CompressString {
    public static void main(String[] args) {
        System.out.println(new CompressString().solve("aaaaaabbbccccaaaaddf"));
    }
    public String solve(String s) {
        int len = s.length()-1, counter = 1;
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();
        start.append(s.charAt(0));
        end.append(s.charAt(len));
        while (len/2 >= counter){
            if(start.charAt(start.length()-1) != s.charAt(counter)){
                start.append(s.charAt(counter));
            }
            if(end.charAt(end.length()-1) != s.charAt(len-counter)){
                end.append(s.charAt(len-counter));
            }
            counter++;
        }
        end.reverse();
        if(start.charAt(start.length()-1) != end.charAt(0)){
            return start.append(end).toString();
        }else {
            if(end.length() > 1){
                return start.append(end.substring(1)).toString();
            }
            return start.toString();
        }
    }
}
