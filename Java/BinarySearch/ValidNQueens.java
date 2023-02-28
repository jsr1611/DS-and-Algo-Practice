import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/01 07:33
 * desc:
 * The n queens puzzle asks to place n queens on an n×n chessboard so that no two queens are attacking each other.
 *
 * Given a two-dimensional integer matrix where 1 represents a queen and 0 represents an empty cell,
 * return whether the board is valid solution to the puzzle.
 *
 * Constraints
 *
 * 1 ≤ n ≤ 10 where n is the number of rows and columns in matrix
 */

public class ValidNQueens {
    public boolean solve(int[][] matrix) {
            for(int i=0; i < matrix.length; i++){
                int row = 0;
                int col = 0;
                int diagonal1=0, diagonal2=0;
                for(int j=0; j < matrix[i].length; j++){
                    row += matrix[i][j];
                    col += matrix[j][i];
                }

                if(row != 1) return false;
                if(col > 1) return false;
                int r=i, c=i;
                int r2=i, c2=i;
                while(r < matrix.length - i && c < matrix.length-i){
                    diagonal1 += matrix[r++][c++];
                    if(r2>0 && c2>0){
                        diagonal2 += matrix[r2++][c2--];
                    }
                }
                if(diagonal1>1) return false;
                if(diagonal2>1) return false;
            }
            return true;
        }
}
