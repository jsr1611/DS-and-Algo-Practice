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
        if(root==null) return true;
        List<Integer> list = new ArrayList<>();
        findInOrder(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
    }
    private static void findInOrder(BTree root,List<Integer> list) {
        if (root.left != null) {findInOrder(root.left,list);}
        list.add(root.val);
        if (root.right != null) {findInOrder(root.right,list);}
    }
}
