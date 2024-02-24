import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/07 21:04
 * desc: Given a list of integers nums, return whether there's an integer whose frequency in the list is same as its value.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 */

public class EquivalentValueAndFrequency {
    public static void main(String[] args) {
    int[] arr = {7, 9, 3, 3, 3};
        System.out.println(solve(arr));
    }
    public static boolean solve(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> sets = new TreeSet<>();
        for(int i=0; i < nums.length; i++){
            sets.add(nums[i]);
            if(map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i])+1));
            }else{
                map.put(nums[i],1);
            }
        }
        for (int num : sets){
            if(map.get(num) == num) return true;
        }
        return false;
    }
}
