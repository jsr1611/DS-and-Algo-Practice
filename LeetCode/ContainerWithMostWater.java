/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/23 09:22
 * desc:
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
 * of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int n = height.length-1;
        int a = 0, z=n;
        int max = n * Math.min(height[a],height[z]);
        for(int i=0; i<height.length; i++){

            if(n * Math.min(height[a], height[z]) > max){
                max = n * Math.min(height[a], height[z]);
            }
            if(height[a] > height[z]){
                z--;
            }
            else{
                a++;
            }
            n--;
        }
        return max;
    }
}
