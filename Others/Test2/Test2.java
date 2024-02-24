import java.util.ArrayList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/10/25 03:55
 Example:
 rpnCalculator("1 2 3 * +") // should return 7

 rpnCalculator("1 2 3 * +") // 7
 rpnCalculator("1156 12 11 * +") // 1288
 rpnCalculator("5 2 + 3 *") // 21
 rpnCalculator("5 2 * 2 * 4 +") // 24
 rpnCalculator("5 2 + 2 + 4 +") // 13
 rpnCalculator("3 2 + 2 4 + *") // 30
 rpnCalculator("3 2 2 4 + + *") // 24
 rpnCalculator("5") // 5
 rpnCalculator("0 1 *") // 0
 rpnCalculator("5 5 + 6 6 + 1 1 + * +") // "10 12 2 * +" => 34
 */


public class Test2 {
    public static void main(String[] args) {
        String s = "1 2 3 * +";
        System.out.println(rpnCalc(s));
    }

    private static int rpnCalc(String s) {
        int result = 0;

        if(!s.contains("*") && !s.contains("+")) return Integer.parseInt(s);
        String[] arr = s.split(" ");
        int count = 0;
        List<String> operations = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (String s1 : arr) {
            if(s1.equals("*") || s1.equals("+")){
                count++;
                operations.add(s1);
            }
            else
                nums.add(Integer.parseInt(s1));
        }

        String withComma = String.join(",", arr);
        int index = withComma.indexOf(operations.get(0));

        for (int i=0; i < count; i++){
               String sub = withComma.substring(0, index-1);        // without last comma
               String op = withComma.substring(index, 1);           // without 1st operation

               int comma = sub.lastIndexOf(",");
               int num = Integer.parseInt(sub.substring(comma+1));


        }

        return result;
    }
}
