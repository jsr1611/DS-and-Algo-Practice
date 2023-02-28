import java.util.Arrays;

/**
 * Project DS-and-Algo-Practice
 * Author: jimmy
 * Created: 7/14/2022 - 6:47 PM
 */

public class SmallestPositiveInteger {
    public static void main(String[] args) {
        System.out.println(new SmallestPositiveInteger().solution( new int[]{1, 3, 6, 4, 1, 2}));
    }

    public int solution(int[] A){
        int smallest = 1;

        int[] sortedArr = Arrays.stream(A)
                .filter(x -> x > 0)
                .sorted().toArray();
        System.out.println(Arrays.toString(sortedArr));
        for(int i=0; i < sortedArr.length; i++){
            if(sortedArr[i] > smallest){
                return smallest;
            }else {
                smallest = sortedArr[i]+1;
            }
        }

        return smallest;
    }

    public int solution2(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num: A){
            if(!map.containsKey(num)) map.put(num, num);
        }

        int result = 1;
        for(Integer num: A){
            if(!map.containsKey(result))return result;
            else result+=1;
        }
        return result;
    }
}
