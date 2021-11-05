package CodeSignal;

public class diagonalSort {
    int[][] diagonalsSort(int[][] a) {
        for(int i = 1; i < a[0].length-1; i++){
            int in= i;
            for(int j=0; j < i; j++){
                if(a[in][j] > a[in-1][j+1]){
                    int temp = a[in][j];
                    a[in][j] = a[in-1][j+1];
                    a[in-1][j+1] = temp;
                }
                in--;
            }
            in = i;
            for(int j=a.length-1; j >= 0; j--){
                if(a[in][j] < a[in+1][j-1]){
                    int temp = a[in][j];
                    a[in][j] = a[in+1][j-1];
                    a[in+1][j-1] = temp;
                }
                in++;
            }
        }
        return a;
    }

}
