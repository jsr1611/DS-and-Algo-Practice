/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 17:21
 * desc: Given a binary tree root, return the sum of all values in the tree.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the number of nodes in root
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */

public class TreeSum {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.left = new Tree(5);
        System.out.println(solve(root));
    }
    public static int solve(Tree root) {
        if(root == null) return 0;
        Queue<Tree> que = new LinkedList<>();
        List<Integer> nums = new ArrayList<>();
        que.add(root);
        while (!que.isEmpty()){
            Tree node = que.poll();
            nums.add(node.val);
            if(node.left!=null){
                que.add(node.left);
            }
            if(node.right!=null)
                que.add(node.right);
        }
        int total = 0;
        for (Integer num : nums) {
            total+=num;
        }
        return total;
    }
}
