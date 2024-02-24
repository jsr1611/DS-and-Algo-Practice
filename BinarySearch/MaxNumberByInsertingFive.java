/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/31 09:39
 */

public class MaxNumberByInsertingFive {
    public static void main(String[] args) {
        System.out.println(solve(-234));
    }
    public static int solve(int n) {
        String s = String.valueOf(n);
        char c;
        int result = 0;
        boolean addedFive = false, isNegative = false;
        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(c != '-') {
                if (!isNegative) {
                    if (!addedFive && Character.getNumericValue(c) < 5) {
                        result = result * 10 + 5;
                        addedFive = true;
                    }
                    result = result * 10 + Character.getNumericValue(c);
                }
                else {
                    if (!addedFive && Character.getNumericValue(c) > 5) {
                        result = result * 10 - 5;
                        addedFive = true;
                    }
                    result = result * 10 - Character.getNumericValue(c);
                }
            }
            else {
                isNegative = true;
                result = result * (-1);
            }
        }
        if(!addedFive)
            result = result * 10 - 5;
        return result;
    }
}
