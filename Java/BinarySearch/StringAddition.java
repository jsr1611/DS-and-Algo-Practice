
/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/25 23:20
 */

public class StringAddition {
    public static void main(String[] args) {
        System.out.println(new StringAddition().solve("326642276351184189957852536744954759121372159212431629295739972968577454913182595241284453967881186528584815131848795718148895516597674993736123293567",
                "451142276351184189957852536744954759121372159212431629295739972968577454913182595241284453967881186528584815131848795718148895516597674993736123293567"));
    }

    public String solve(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i=a.length()-1, j=b.length()-1, carry = 0;

        while (i>=0 || j >= 0 || carry > 0){
            int sum = carry;
            sum += i >= 0 ? a.charAt(i--) -'0' : 0;
            sum += j >= 0 ? b.charAt(j--) - '0' : 0;
            res.append(sum % 10);
            carry = sum / 10;
        }
        return res.reverse().toString();
    }
}
