/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 16:26
 */

public class DoCompare1 {
    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc"};
        for(String ss: table){
            int ii = 0;
            while (ii < table.length){
                System.out.println(ss + ", " + ii);
                ii++;
            }
        }
    }
}
