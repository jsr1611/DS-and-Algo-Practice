/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/05/30 11:38
 */

/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
    // Complete the function
    let max = nums[0];
    let secMax;
    for(let i=1; i < nums.length; i++){
        if(nums[i] > max){
            secMax = max;
            max = nums[i];
        }
        else if(secMax < nums[i]){
            secMax = nums[i];
        }
    }
    return secMax;
}