import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/29 18:41
 */

public class FirstMissingPositiveSequel {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr) {
        int smallestMissing = 1;
        if(arr.length==0) return smallestMissing;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > smallestMissing) return arr[i]-1;
            else {
                smallestMissing = arr[i]+1;
            }
        }
        return smallestMissing;
    }
}
