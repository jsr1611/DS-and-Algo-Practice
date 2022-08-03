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
        int[][] arr = new int[matrix.length][matrix[0].length];
        List<Integer> zeroCols = new LinkedList<>();
        boolean zerosRow = false;
        for (int i=0; i < matrix.length; i++) {
            zerosRow = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    colorCol(j, arr);
                    zeroCols.add(j);
                    Arrays.fill(arr[i], 0);
                    zerosRow = true;
                }
                else {
                    if(!zeroCols.contains(j) && !zerosRow)
                        arr[i][j] = matrix[i][j];
                }
            }
        }
        return arr;
    }
    private static void colorCol(int i, int[][] arr){
        for(int k=0; k < arr.length; k++){
            arr[k][i] = 0;
        }
    }
}
