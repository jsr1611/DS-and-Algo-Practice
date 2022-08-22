import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 10:22
 */
class BTree {
    int val;
    BTree left;
    BTree right;
    public BTree(int val){
        this.val = val;
        this.left = this.right = null;
    }
}

public class BinarySearchTreeValidation {
    public static void main(String[] args) {
        BTree root = new BTree(1);
        root.left = new BTree(2);
//        root.right = new BTree(9);
//        root.right.left = new BTree(7);
//        root.right.right = new BTree(12);
//        root.right.left.left = new BTree(4);
//        root.right.left.right = new BTree(8);
        System.out.println(solve(root));
    }
    public static boolean solve(BTree root) {
        return solve(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean solve(BTree node, int MIN, int MAX) {
        if (node == null)
            return true;
        if (node.val >= MIN && node.val <= MAX && solve(node.left, MIN, node.val)
                && solve(node.right, node.val, MAX))
            return true;
        else
            return false;
    }
}
//    List<Integer> inOrder = new ArrayList<>();
//    findInOrder(root,inOrder);
//
//        for (int i = 1; i < inOrder.size(); i++) {
//        if (inOrder.get(i) <= inOrder.get(i - 1))
//        return false;
//        }
//        return true;
//
//        }
//
//public void findInOrder(TreeNode root,List<Integer> inOrder) {
//        if (root.left != null) {findInOrder(root.left,inOrder);}
//        inOrder.add(root.val);
//        if (root.right != null) {findInOrder(root.right,inOrder);}
//        }
