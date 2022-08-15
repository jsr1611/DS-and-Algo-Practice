import java.util.HashMap;
import java.util.Map;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/16 07:44
 * desc: You are given a list of integers tasks where each different integer represents a different task type,
 * and a non-negative integer k. Each task takes one unit of time to complete and each task must be done in order,
 * but you must have k units of time between doing two tasks of the same type. At any time,
 * you can be doing a task or waiting.
 *
 * Return the amount of time it takes to complete all the tasks.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of tasks
 */

public class TaskRun {
    public int solve(int[] tasks, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i=0, count = 0;
        for(Integer task: tasks){
            int num = 0;
            if(map.containsKey(task) && k > 0) {
                num = i - map.get(task)-1;
                if(num < k){
                    count += (k-num);
                    i += (k-num);
                }
            }
            map.put(task, i);
            i++;
            count++;

        }
        return count;
    }
}
