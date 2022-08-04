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
        int left = solve(root.left);
        int right = solve(root.right);
        return root.val + left+right;
    }
}
