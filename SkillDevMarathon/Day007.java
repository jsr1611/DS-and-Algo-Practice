import java.util.HashSet;
import java.util.Set;

public class Day007 {
    /*
    @description 2520. Count the Digits That Divide a Number
    @author jsr1611
    @reference https://leetcode.com/problems/count-the-digits-that-divide-a-number/
     */
    public int countDigits(int num){
        if(num < 10) return 1;
        int count = 0;
        int cpNum = num;
        int sufNum = 0;

        while (cpNum > 0){
            sufNum = cpNum % 10;
            if(num % sufNum == 0){
                count++;
            }
            cpNum /= 10;
        }
        return count;
    }

    /*
    @description 48. Rotate Image
    @author jsr1611
    @reference https://leetcode.com/problems/rotate-image/
     */
    public void rotate(int[][] matrix){
        /* you have to rotate the image in-place, don't create another matrix */
        int n = matrix.length;
        // column reverse
        for(int i=0; i < n; i++){
            int a = 0;
            int b = n-1;
            while(a <= b){
                int tmp = matrix[a][i];
                matrix[a][i] = matrix[b][i];
                matrix[b][i] = tmp;
                a++;
                b--;
            }
        }

        //transpose
        for (int i=0; i < n; i++){
            for (int j=i+1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
