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
}
