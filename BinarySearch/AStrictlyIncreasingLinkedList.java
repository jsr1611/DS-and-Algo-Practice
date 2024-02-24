import java.util.LinkedList;
import java.util.List;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/03 18:21
 * desc: Given the head of a singly linked list head, return whether the values of the nodes are sorted
 * in a strictly increasing order.
 *
 * Constraints
 *
 * 1 ≤ n ≤ 100,000 where n is the number of nodes in head
 */

class LLNode {
    int val;
    LLNode next;
    public  LLNode(int val){
        this.val = val;
        this.next = null;
    }

    public LLNode(int val, LLNode node){
        this.val = val;
        if(node != null)
            this.next = node;
    }
}


public class AStrictlyIncreasingLinkedList {
    public static void main(String[] args) {
        LLNode node = new LLNode(1);
        LLNode node2 = new LLNode(5, node);
        LLNode node3 = new LLNode(8, node2);
        LLNode node4 = new LLNode(9, node3);
        System.out.println(solve(node));
    }

    public static boolean solve(LLNode head) {
        while (head.next != null) {
            if (head.val >= head.next.val)
                return false;
            head = head.next;
        }
        return true;
    }

}
