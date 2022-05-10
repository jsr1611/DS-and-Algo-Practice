import java.util.*;

/**
 * Project DS-and-Algo-Practice
 * Author: Jumanazar
 * Created: 5/10/2022 - 12:40 PM
 */

public class OddOccurrencesInArraySolution {
    public static void main(String[] args) {
        OddOccurrencesInArraySolution solution = new OddOccurrencesInArraySolution();
        int[] arr = new int[]{9,3,9,3,9};
        System.out.println(solution.solution(arr));
    }

    public int solution(int[] A){
        if(A.length == 1){
            return A[0];
        }
        int length = A.length;
        Arrays.sort(A);
        for (int i=0; i < length;i+=2){
            if(i+1 == length || A[i] != A[i+1]){
                return A[i];
            }
        }
        return 0;
    }
}
