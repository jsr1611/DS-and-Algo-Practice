/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 23:48
 * desc: Given a string s, return its run-length encoding. You can assume the string to be encoded have no digits
 * and consists solely of alphabetic characters.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of s
 */

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(solve("aaaabbbccdaa"));
    }
    public static String solve(String s) {
            StringBuilder res = new StringBuilder();
            char pointer = s.charAt(0);
            int counter = 1;
            for(int i=1;i<s.length(); i++){
                if(s.charAt(i) == pointer){
                    counter++;
                }else{
                    res.append(counter).append(pointer);
                    counter = 1;
                    pointer = s.charAt(i);
                }
                if(i==s.length()-1) res.append(counter).append(pointer);
            }

            return res.toString();
        }
    }
