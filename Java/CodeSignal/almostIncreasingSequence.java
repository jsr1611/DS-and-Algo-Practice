/*
Author: Jumanazar Saidov
Date: 2021.11.04
Definition:
Given a sequence of integers as an array, determine whether
it is possible to obtain a strictly increasing sequence
by removing no more than one element from the array.
Link: https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG
 */
class Main2 {
    public boolean almostIncreasingSequence(int[] sequence){
        int swaps = 0;
        for(int i=0; i < sequence.length-1; i++){
            if(sequence[i+1] < sequence[i]){
                swaps++;
            }
        }
        if(swaps >= 2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main2 main = new Main2();
        boolean res = main.almostIncreasingSequence(new int[]{1, 3, 2});
        System.out.println(res);
    }
}
