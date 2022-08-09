/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/09 18:14
 */

public class ASCIIStringToInteger {
    public int solve(String s) {
        int total = 0;
        StringBuilder sb = new StringBuilder();
        char c;

        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
                if(sb.length() > 0 && i == s.length()-1){
                    total += Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                }
            }
            else{
                if(sb.length() > 0){
                    total += Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                }
            }

        }
        return total;
    }
}
