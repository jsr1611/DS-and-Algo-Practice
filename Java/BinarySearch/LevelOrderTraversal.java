import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 02:44
 * desc: Given a binary tree root return a level order traversal of the node values.
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the number of nodes in root
 */

class Tree {
 int val;
 Tree left;
 Tree right;
 public Tree(int val){
     this.val = val;
     this.left = this.right = null;
 }
 }


public class LevelOrderTraversal {
    public static void main(String[] args) {
        Tree root = new Tree(0);
        root.left = new Tree(5);
        root.right = new Tree(9);
        root.right.left = new Tree(1);
        root.right.right = new Tree(3);
        root.right.left.left = new Tree(4);
        root.right.left.right = new Tree(2);
        System.out.println(Arrays.toString(solve(root)));
    }
    public static int[] solve(Tree root) {
        int count = 0;
        Queue<Tree> que = new LinkedList<>();
        Queue<Integer> nums = new LinkedList<>();
        que.add(root);
        nums.add(root.val);
        while(!que.isEmpty()){
            Tree head = que.poll();
            if(head.left != null){
                nums.add(head.left.val);
                count++;
                que.add(head.left);
            }
            if(head.right != null){
                nums.add(head.right.val);
                count++;
                que.add(head.right);
            }
        }
        int[] arr = new int[nums.size()];
        for(int i=0; i < arr.length; i++){
            if(!nums.isEmpty())
                arr[i] = nums.poll();
        }
        return arr;
    }
}
