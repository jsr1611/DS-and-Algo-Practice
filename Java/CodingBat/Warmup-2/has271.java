/*
Author: Jumanazar Saidov
Date: 2021.11.03
Link: https://codingbat.com/prob/p167430
 */
public boolean has271(int[] nums) {
    for(int i=0; i < nums.length-2; i++){
        if(nums[i+1] == nums[i]+5 && (nums[i+2] <= nums[i]+1 && nums[i+2] >= nums[i]-3) ){
            return true;
        }
    }
    return false;
}
