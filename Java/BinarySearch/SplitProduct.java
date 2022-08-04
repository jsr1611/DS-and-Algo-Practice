/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/05 07:53
 * desc: Given an integer n, find two or more integers such that their sum is equal to n,
 * where the product of these integers is maximized, and return this product.
 *
 * Constraints
 *
 * n ≤ 100,000
 */

public class SplitProduct {
    public int solve(int n) {
        if(n==0) return 0;
        if(n<=3) return n-1;
        if(n==4) return 4;
        int total = 1;
        int remaining = n%3;
        int len = n/3;
        if(remaining == 1){
            len-=1;
            remaining = 4;
        }
        for(int i=0; i < len; i++){
            total *= 3;
        }
        if(remaining != 0)
            total *= remaining;
        return total;
    }
}
