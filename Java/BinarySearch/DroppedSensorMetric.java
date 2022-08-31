/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/09/01 07:11
 * desc: You are given two lists of integers a and b representing sensor metrics. Each list contains unique
 * integers and a ≠ b. One of the lists contains accurate sensor metrics but the other one is faulty.
 * In the faulty list one number that wasn't the last number was dropped and a fake value was appended
 * to the end of the list. Return the number that was dropped.
 *
 * Constraints
 *
 * 2 ≤ n ≤ 100,000 where n is the length of a and b
 * Example 1
 * Input
 * a = [1, 2, 3]
 * b = [2, 3, 5]
 * Output
 * 1
 * Explanation
 * The accurate metrics come from a = [1, 2, 3].
 */

public class DroppedSensorMetric {
    public int solve(int[] a, int[] b){
        for(int i=0; i < a.length; i++){
            if(a[i]!=b[i]){
                if(i+1 < a.length){
                    if(a[i] == b[i+1]) return b[i];
                    else return a[i];
                }
            }
        }
        return 0;
    }
}
