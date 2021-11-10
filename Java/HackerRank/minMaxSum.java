/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://www.hackerrank.com/challenges/one-month-preparation-kit-mini-max-sum/problem?h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
 */


public static void miniMaxSum(List<Integer> arr){
    // Write your code here
    int max=arr.get(0),min=arr.get(0);
    boolean duplicateCheckerMax=false,duplicateCheckerMin=false;
    long maxSum=0L,minSum=0L;
    for(int i=1;i<arr.size();i++){
        if(max<arr.get(i)){
            max=arr.get(i);
        }
        if(min>arr.get(i)){
            min=arr.get(i);
        }
    }
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>=1&&arr.get(i)<=1000000000){
            if(arr.get(i)!=min||duplicateCheckerMax){
            maxSum+=arr.get(i);
            }
            else{
                duplicateCheckerMax=true;
            }
            if(arr.get(i)!=max||duplicateCheckerMin){
                minSum+=arr.get(i);
            }
            else{
                duplicateCheckerMin=true;
            }
        }
    }
    System.out.println(minSum+" "+maxSum);
}