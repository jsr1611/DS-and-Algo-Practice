import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/30 00:22
 * desc: Given a list of integers nums, pack consecutive elements of the same value into sublists.
 *
 * Note: If there's only one occurrence in the list it should still be in its own sublist.
 *
 * Constraints
 *
 * 0 ≤ n ≤ 100,000 where n is the length of nums
 * Input
 * nums = [4, 4, 1, 6, 6, 6, 1, 1, 1, 1]
 * Output
 * [
 *     [4, 4],
 *     [1],
 *     [6, 6, 6],
 *     [1, 1, 1, 1]
 * ]
 */

public class PackingBoxes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 2, 3, 3,3,3, 0, 1,2,3};
        solve(arr);
    }
    public static int[][] solve(int[] nums) {
        if(nums.length==0) return new int[][]{};
        List<int[]> result = new ArrayList<>();
        int counter = 0;
        int pointer = nums[0];
        for (int i=0; i<nums.length;i++) {
            if (nums[i] == pointer) {
                counter++;
            }
            else {
                int[] res = getArr(pointer, counter);
                result.add(res);
                pointer = nums[i];
                counter = 1;
            }
            if(i == nums.length-1) {
                System.out.println("ii: ");
                int[] res = getArr(pointer, counter);
                result.add(res);
            }
        }
        int[][] res2 = new int[result.size()][];
        for(int i=0; i < result.size();i++){
            res2[i] = result.get(i);
        }
        return res2;
    }
    private static int[] getArr(int val, int len){
        int[] arr = new int[len];
        Arrays.fill(arr, val);
        return arr;
    }
}
