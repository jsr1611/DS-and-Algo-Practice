/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 01:49
 * desc: Find the minimum number of coins required to make n cents.
 *
 * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
 *
 * Constraints
 *
 * 0 ≤ n < 2 ** 31
 *
 * Example 1
 * Input
 * n = 3
 * Output
 * 3
 * Explanation
 * You can make this with 3 pennies.
 */

public class MakingChange {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static int solve(int n) {
        int totalCoins = 0;
        int divident = 0;
        if(n >= 25){
            divident = n/25;
            totalCoins+= divident;
            n -= (divident * 25);
        }
        if(n >= 10){
            divident = n/10;
            totalCoins += divident;
            n -= (divident*10);
        }
        if(n >= 5){
            divident = n/5;
            totalCoins += divident;
            n -= (divident*5);
        }
        if(n>0)
            totalCoins += n;
        return totalCoins;
    }
}
