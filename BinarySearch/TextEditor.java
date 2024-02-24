/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 23:23
 */

public class TextEditor {
    public static void main(String[] args) {
        System.out.println(solve("<-"));
    }
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        char c, next;
        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == '<' && i <= s.length()-2 && s.charAt(i+1) == '-'){
                if(sb.length()>0)
                    sb.deleteCharAt(sb.length()-1);
                i++;
            }
            else {
                    sb.append(c);
            }
        }
        return sb.toString();
    }
}
