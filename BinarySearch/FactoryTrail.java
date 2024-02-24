/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/06 06:49
 */

public class FactoryTrail {
    public static void main(String[] args) {
        System.out.println(solve(2002082088));
    }
    //n = 2002082088
    public static int solve(int n) {
        if(n<0) return 0;
        int total = 0;
        for(int i=5; n/i>0; i*=5){
            total += (n/i);
            if(n/i == 1) break;
        }
        return total;
    }
}
