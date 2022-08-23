import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/23 13:20
 * desc:
 * Sum of Two Numbers - Online Version
 *
 * Implement a data structure with the following methods:
 *
 * add(int val) adds the value val to the data structure
 * find(int val) returns whether there are two elements whose sum equals to val
 * Constraints
 *
 * n ≤ 10,000 where n is the number of times add will be called
 * m ≤ 1,000 where m is the number of times find will be called
 * Example 1
 * Input
 * methods = ["constructor", "add", "find", "add", "find"]
 * arguments = [[], [5], [10], [6], [11]]`
 * Output
 * [null, null, false, null, true]
 * Explanation
 * We create a TwoSum first
 * Then we add the number 5 to the data structure
 * We check if there's two numbers whose sum is 10. There isn't, so we return false
 * Then we add the number 6 to the data structure
 * We check if there's two numbers whose sum is 11, which there is since 5 + 6 = 11.
 */

public class TwoSum {
    Map<Integer, Integer> map = null;
    List<Integer> list = null;
    int count;
    public TwoSum() {
        map = new HashMap<>();
        list = new ArrayList<>();
        count = 0;
    }

    public void add(int val) {
        map.put(val,count++);
        list.add(val);

    }

    public boolean find(int val) {
        if(list.size() < 1) return false;
        for(int i=0; i < list.size(); i++){
            int rem = val - list.get(i);
            if(map.containsKey(rem) && map.get(rem) != i) return true;
        }
        return false;
    }
}
