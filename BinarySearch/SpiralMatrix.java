import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 21:14
 * desc: Given a 2-d array matrix, return elements in spiral order starting from matrix[0][0].
 *
 * Constraints
 *
 * n, m ≤ 250 where n and m are the number of rows and columns in matrix
 */

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                        {1,2,3},
                        {8,9,4},
                        {7,6,5}
                    };
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static int[] solve(int[][] matrix) {
        int columnCount = matrix.length;
        int rowCount = matrix[0].length;

        int[] arr = new int[columnCount * rowCount];
        int row = 0, column = 0, count = 0;
        while (count < arr.length) {
            if (count + 1 == rowCount) {
                column++;
            }


        }
        return arr;
    }
}
