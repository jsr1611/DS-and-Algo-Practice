import java.util.HashMap;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 18:42
 * What is the result of this code?
 * a) 7 *
 * b) 3
 * c) 6
 * d) 4
 */

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apples", 3);
        map.put("Oranges", 2);

        int currentApples = map.get("Apples");
        map.put("Apples", currentApples+4);
        System.out.println(map.get("Apples"));
    }
}
