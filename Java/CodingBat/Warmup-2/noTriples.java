/*
Author: Jumanazar Saidov
Date: 2021.11.03
Link: https://codingbat.com/prob/p170221
 */
public boolean noTriples(int[] nums) {
    for(int i=0; i < nums.length-2; i++){
        if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
            return false;
        }
    }
    return true;
}
