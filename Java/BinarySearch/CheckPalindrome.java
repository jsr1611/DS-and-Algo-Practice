/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/25 13:46
 */

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(new CheckPalindrome().solve("olaamalo"));
    }
    public boolean solve(String s) {
        for(int i=0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
