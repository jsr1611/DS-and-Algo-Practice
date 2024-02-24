import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/28 11:16
 * desc: Given a number n, return a list of all prime numbers smaller than or equal to n in ascending order.
 *
 * Constraints
 * n ≤ 100,000
 *
 * Example
 * Input
 *      n = 3
 * Output
 *      [2, 3]
 */

public class GeneratePrimes {
    public static void main(String[] args) {
        Instant start = Instant.now();
        solve(100);
        Instant end = Instant.now();
        System.out.println((end.getNano() - start.getNano())/1000_000.0);
    }
    public static int[] solve(int n) {
        boolean[] arr = new boolean[n+1];
        List<Integer> primes = new LinkedList<>();
        Arrays.fill(arr, true);
        for(int i=2; i <= n; i++){
            if(arr[i])
            for(int j=i*i; j <=n; j += i){
                arr[j] = false;
            }
        }
        for (int i=2; i < arr.length; i++) {
            if(arr[i]){
                primes.add(i);
            }
        }
        return primes.stream().mapToInt(Integer::intValue).toArray();
    }
}
