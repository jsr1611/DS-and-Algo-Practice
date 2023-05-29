import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Given an array of integers, where all elements but one occur twice, find the unique element.

Example

The unique element is .

Function Description

Complete the lonelyinteger function in the editor below.

lonelyinteger has the following parameter(s):

int a[n]: an array of integers
Returns

int: the element that occurs only once
Input Format

The first line contains a single integer, , the number of integers in the array.
The second line contains  space-separated integers that describe the values in .
 */
/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */
public class LonelyInteger {


    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (map.containsKey(i)) {
                map.remove(i);
            } else {
                map.put(i, 0);
            }
        }
        Set<Integer> num = map.keySet();
        return num.iterator().next();
    }
}






