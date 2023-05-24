/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/26 17:19
 * desc:
 * You are given an integer n representing n full drink bottles. Given that you can exchange 3 empty bottles
 * for 1 full drink bottle, return the number of full bottles you can drink.
 * Constraints
 *
 * 0 ≤ n < 2 ** 31
 * Example 1
 * Input
 * n = 9
 * Output
 * 13
 * Explanation
 * In first round, we drink 9 drink bottles.
 * We can exchange the 9 empty ones for 3 drink bottles.
 * We can exchange the 3 empty ones for 1 drink bottle.
 */

public class BottlesOfDrink {
    public int solve(int n) {
        int total = n;
        while(n > 2){
            total += (n/3);
            n = (n%3) + (n/3);
        }
        return total;
    }
}
