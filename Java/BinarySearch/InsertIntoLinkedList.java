import java.util.LinkedList;
import java.util.Queue;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/08 10:34
 * desc: You are given a singly linked list head as well as integers pos and val. Insert a new node with value val before index pos of head.
 *
 * Constraints
 *
 * 1 ≤ n ≤ 100,000 where n is the number of nodes in head
 * 0 ≤ pos ≤ n
 */

public class InsertIntoLinkedList {
    public static void main(String[] args) {
        LLNode head = new LLNode(1, new LLNode(0, null));
        head = solve(head, 1, 0);
        Queue<LLNode> q = new LinkedList<>();
        q.add(head);
        while (!q.isEmpty()){
            LLNode node = q.poll();
            System.out.print(node.val);
            if(node.next != null){
                System.out.print(" -> ");
                q.add(node.next);
            }
        }
    }
    public static LLNode solve(LLNode head, int pos, int val) {
        if(pos == 0) return new LLNode(val, head);
        LLNode node = head;
        int count = 1;
        while (true){
            if(pos == count){
                if(node.next != null){
                    node.next = new LLNode(val, node.next);
                }
                else {
                    node.next = new LLNode(val, null);
                }
                break;
            }
            node = node.next;
            count++;
        }
        return head;
    }
}
