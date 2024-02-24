/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p184031
 */

public int arrayCount9(int[] nums) {
    int count = 0;
    for(int num : nums){
        if(num == 9){
            count++;
        }
    }
    return count;
}
