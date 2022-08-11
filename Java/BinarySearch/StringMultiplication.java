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
        if (a.contains("-")) {
            a_sign = true;
            a = a.substring(1);
        }
        if (b.contains("-")) {
            b_sign = true;
            b = b.substring(1);
        }
        int numA, numB;
        for (int i = 0; i < a.length(); i++) {
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < b.length(); j++) {
                numA = Character.getNumericValue(a.charAt(a.length() - 1 - i));
                numB = Character.getNumericValue(b.charAt(b.length() - 1 - j));
                num =  numA * numB;
                if (carry > 0) {
                    num += carry;
                    carry = 0;
                }
                if (num > 9) {
                    sb2.append(num % 10);
                    carry = num / 10;
                } else {
                    sb2.append(num);
                }
            }
            if (carry > 0) {
                sb2.append(carry);
                carry = 0;
            }
            sb2.reverse();
            result = add(result, sb2.toString(), i);
        }
        if ((!a_sign && b_sign) || (a_sign && !b_sign)) result = "-" + result;
        return result;
    }

    private String add(String a, String b, int index) {
        StringBuilder sb = new StringBuilder();
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
                sb.append(carry % 10);
                carry /= 10;
            } else {
                sb.append(carry);
                carry = 0;
            }
        }
        if (carry != 0) sb.append(carry);
        sb.reverse();
        sb.append(a_suffix);
        return sb.toString();
    }
}
