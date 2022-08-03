import java.util.Arrays;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 21:31
 */

public class MergingTwoSortedStrings {
    public static void main(String[] args) {
        int[] a = {5, 10, 15};
        int[] b = {3,8,9};
        System.out.println(Arrays.toString(solve(a,b)));
    }
    public static int[] solve(int[] a, int[] b) {
        if(a.length == 0) return b;
        else if(b.length == 0) return a;
        int[] arr = new int[a.length + b.length];
        int ap = 0, bp = 0, i = 0;
        while(i < arr.length){
            if(a[ap] > b[bp]){
                arr[i] = b[bp];
                if(bp+1 != b.length)
                    bp++;
                else{
                    while(i < arr.length-1){
                        arr[++i] = a[ap++];
                    }
                    return arr;
                }
            }
            else{
                arr[i] = a[ap];
                if(ap+1 != a.length)
                    ap++;
                else{
                    while(i < arr.length-1){
                        arr[++i] = b[bp++];
                    }
                    return arr;
                }
            }
            i++;
        }
        return arr;
    }
}
