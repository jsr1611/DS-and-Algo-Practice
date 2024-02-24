/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/06/09 10:50
 */

public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            int p = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == val){
                    nums[i] = -1;
                }else{
                    count++;
                    nums[p++] = nums[i];
                    if(p-1 != i)
                        nums[i] = -1;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
