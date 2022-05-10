import java.util.*;

/**
 * Project DS-and-Algo-Practice
 * Author: Jumanazar
 * Created: 5/10/2022 - 12:40 PM
 */

public class OddOccurrencesInArraySolution {
    public static void main(String[] args) {
        OddOccurrencesInArraySolution solution = new OddOccurrencesInArraySolution();

        System.out.println(solution.solution(new int[]{9,3,9,3,9,7,9}));
    }

    public int solution(int[] A){
        if(A.length == 1){
            return A[0];
        }
//        List<Integer> singles = new LinkedList<>();
        Map<Integer, Integer> nums = new HashMap<>();
        int sinlge = -1;
        for (int num : A){
            if (nums.containsKey(num)){
                nums.remove(num);
                System.out.println(num + ": pairs removed");
            }
            else {
                nums.put(num, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = nums.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            sinlge = entry.getKey();
        }
        return sinlge;
    }
}
