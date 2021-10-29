/*
 Author: Jumanazar Saidov
 Date: 2021-10-29
 Link: https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem?h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
*/

/*
  Complete the 'plusMinus' function below.
  The function accepts INTEGER_ARRAY arr as parameter.
*/

 public static void plusMinus(List<Integer> arr) {
         // Write your code here
         int positives = 0, negatives=0, zeros=0;
         for(int i=0; i < arr.size(); i++){
         if(arr.get(i) > 0){
         positives++;
         }
         else if(arr.get(i)<0){
         negatives++;
         }
         else{
         zeros++;
         }
         }
         System.out.printf("%.6f\n", positives / (double)arr.size());
         System.out.printf("%.6f\n", negatives / (double)arr.size());
         System.out.printf("%.6f\n", zeros / (double)arr.size());
         }
