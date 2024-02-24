import java.util.HashMap;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/31 13:44
 */

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(solve(6));
    }
    public static int solve(int n) {
        int key = 3;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1,1);
        map.put(2,1);
        while(key <= n){
            map.put(key, map.get(key-1) + map.get(key-2));
            key++;
        }
        return map.get(n);
    }
}
