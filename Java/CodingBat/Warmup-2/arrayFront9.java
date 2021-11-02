/*
Author: Jumanazar Saidov
Date: 2021.11.02
Link: https://codingbat.com/prob/p186031
 */

public boolean arrayFront9(int[] nums) {
    int len = nums.length > 4 ? 4 : nums.length;
    for(int i=0; i < len; i++){
        if(nums[i] == 9){
            return true;
        }
    }
    return false;
}
