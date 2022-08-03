import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 23:41
 */

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {5, 0, 0, 5, 8},
                {9, 8, 10, 3, 9},
                {0, 7, 2, 3, 1},
                {8, 0, 6, 7, 2},
                {4, 1, 8, 5, 10}
        };
        /*
        [
    [0, 0, 0, 0, 0],
    [0, 0, 0, 3, 9],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 5, 10]
]
         */

        int[][] arr =  solve(mat);

        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a + "  ");

            }
            System.out.println();
        }
    }
    public static int[][] solve(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i=0; i < matrix.length;i++){
            for(int j=0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
