/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/09 00:04
 * desc: Given a two-dimensional matrix of integers matrix, determine whether it's a Toeplitz matrix.
 * A Toeplitz is one where every diagonal descending from left to right has the same value.
 *
 * Constraints
 *
 * n, m ≤ 250 where n and m are the number of rows and columns in matrix
 */

public class ToeplitzMatrix {
    public boolean solve(int[][] matrix) {
        for(int i=1; i < matrix[0].length; i++){
            for(int j=1; j < matrix.length; j++){
                if(j < matrix.length ){
                    if(matrix[j][i] != matrix[j-1][i-1]) return false;
                }
            }
        }
        return true;
    }
}
