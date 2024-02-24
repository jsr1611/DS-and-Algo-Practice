/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/11 11:50
 */

public class StringMultiplication {
    public String solve(String a, String b) {
        if (a.equals("0") || b.equals("0")) return "0";
        String result = "";
        int num = 1, carry = 0;
        boolean a_sign = false, b_sign = false;
        boolean negativeSign = (a.charAt(0) == '-') ^ (b.charAt(0) == '-');
        if(negativeSign){
            a = a.charAt(0) == '-' ? a.substring(1) : a;
            b = b.charAt(0) == '-' ? b.substring(1) : b;
        }
        int numA, numB;
        for (int i = 0; i < a.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < b.length(); j++) {
                numA = Character.getNumericValue(a.charAt(a.length() - 1 - i));
                numB = Character.getNumericValue(b.charAt(b.length() - 1 - j));
                num =  numA * numB;
                if (carry > 0) {
                    num += carry;
                    carry = 0;
                }
                if (num > 9) {
                    stringBuilder.append(num % 10);
                    carry = num / 10;
                } else {
                    stringBuilder.append(num);
                }
            }
            if (carry > 0) {
                stringBuilder.append(carry);
                carry = 0;
            }
            stringBuilder.reverse();
            result = add(result, stringBuilder.toString(), i);
        }
        if (negativeSign) result = "-" + result;
        return result;
    }

    private String add(String a, String b, int index) {
        StringBuilder sbAddition = new StringBuilder();
        int carry = 0;
        String a_suffix = "";
        if (index > 0) {
            a_suffix = a.substring(a.length() - index);
            a = a.substring(0, a.length() - index);
        }
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (a.length() > i) carry += Character.getNumericValue(a.charAt(a.length() - 1 - i));
            if (b.length() > i) carry += Character.getNumericValue(b.charAt(b.length() - 1 - i));
            if (carry > 9) {
                sbAddition.append(carry % 10);
                carry /= 10;
            } else {
                sbAddition.append(carry);
                carry = 0;
            }
        }
        if (carry != 0) sbAddition.append(carry);
        sbAddition.reverse();
        sbAddition.append(a_suffix);
        return sbAddition.toString();
    }
}
