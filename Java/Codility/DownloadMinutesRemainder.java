/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/15
 * Question 2 out of 3. Toptal online coding
 */


import java.util.Arrays;

public class DownloadMinutesRemainder {

    public static void main(String[] args) {
        System.out.println(new DownloadMinutesRemainder().solution(100, new int[]{10, 6}, 3));
    }

    public int solution(int X, int[] B, int Z) {
        // write your code in Java SE 8
        int minutesRemaining = -1;
        int sum = Arrays.stream(B).sum();
        if(sum == X){
            return 0;
        }
        else if (sum < X && B.length > 0){
            double avg = 0.0;
            if(B.length >= Z){
                double total = 0.0;

                for(int i=0; i < Z; i++){
                    total += B[B.length-1-i];
                }
                avg = total / Z;
            }
            else {
                avg =  (sum / (double)B.length);
            }
            return  (int)Math.ceil((X - sum) / avg);
        }
        else {
            return minutesRemaining;
        }
    }
}