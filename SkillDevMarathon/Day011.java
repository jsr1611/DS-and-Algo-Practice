import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> repetitive = new ArrayList<>();
        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int count = 0;
        int curElem;
        int length = nums.length;
        Set<Integer> rowNums = new HashSet<>();
        while (count < length){
            curElem = arr.get(count++);
            if(!rowNums.contains(curElem)){
                rowNums.add(curElem);
                row.add(curElem);

            }else {
                repetitive.add(curElem);
            }
            if(count == length){
                result.add(new ArrayList<>(row));
                rowNums = new HashSet<>();
                row = new ArrayList<>();
                count = 0;
                arr = new ArrayList<>(repetitive);
                length = arr.size();
                repetitive = new ArrayList<>();
            }
        }
        return result;
    }
}
