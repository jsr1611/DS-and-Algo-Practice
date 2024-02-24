/*
Author: Jumanazar Saidov
Date: 2021.11.03
Link: https://codingbat.com/prob/p110019
 */

public int array667(int[] nums) {
    int count = 0;
    for(int i=0; i<nums.length-1; i++){
        if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)){
            count++;
        }
    }
    return count;
}
