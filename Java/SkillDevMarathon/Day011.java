import java.util.*;

public class Day011 {

    /*
    @description 1431. Kids With the Greatest Number of Candies
    @author jsr1611
    @reference https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int maxCandy = candies[0];
        for (int candy: candies){
            if(maxCandy < candy){
                maxCandy = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxCandy) {
                result.add(true);
            } else
                result.add(false);
        }

        return result;
    }

    /*
    @description 2610. Convert an Array Into a 2D Array With Conditions
    @author jsr1611
    @reference https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
     */
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        int count = 0;
        int curElem;
        int length = nums.length;
        Set<Integer> rowNums = new HashSet<>();
        while (count < length){
            curElem = nums[count++];
            if(!rowNums.contains(curElem)){
                rowNums.add(curElem);
                row.add(curElem);
                if(count == length){
                    result.add(row);
                }
            }else {
                result.add(row);
                rowNums = new HashSet<>();
                row = new ArrayList<>();
            }
        }
        return result;
    }

}
