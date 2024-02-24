/*
Author: Jumanazar Saidov
Date: 2021.11.04
Definition:
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having an non-negative integer size. Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger than
the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
Help him figure out the minimum number of additional statues needed.
Link: https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC/solutions
 */

class Main {
    public int makeArrayConsecutive2(int[] statues) {
        int temp = 0;
        for (int j=0; j < statues.length; j++) {
            int numSwaps = 0;
            for (int i = 0; i < statues.length - 1; i++) {
                if (statues[i] > statues[i + 1]) {
                    temp = statues[i];
                    statues[i] = statues[i + 1];
                    statues[i + 1] = temp;
                    numSwaps++;
                    System.out.println("swapped: " + temp + " " + statues[i]);
                }
                else {
                    System.out.println("No swap here");
                }
            }
            if (numSwaps == 0) {
                break;
            }
        }
        int numAddSt = 0;
        for(int i=0; i < statues.length-1; i++){
            if(statues[i+1] - statues[i] > 1){
                numAddSt += (statues[i+1] - statues[i] - 1);
            }
        }
        return numAddSt;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.makeArrayConsecutive2(new int[]{6, 2, 3, 8}));

    }
}