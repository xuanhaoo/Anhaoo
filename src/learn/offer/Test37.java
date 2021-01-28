package learn.offer;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 两个链表的第一个公共节点
 */
public class Test37 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode result = null;
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while (pHead1 != null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            stack1.pop();
            result = stack2.pop();
        }
        return result;
    }

    /**
     * 链表比较，先求出两个链表的长度，因为链表有相同的节点，那么从相同的节点开始后边的所有节点都是重合的。
     * 让长的链表先走，走到差值的位置，然后两个链表开始同时遍历，直到找到第一个相同的节点
     * @param node1
     * @param node2
     * @return
     */
    /**
     private static ListNode getTheFristNode(ListNode node1, ListNode node2) {
     ListNode result = null;
     if (node1 == null || node2 == null) {
     return null;
     }
     int length1 = 0, length2 = 0;
     // 先分别求出两个链表的长度
     while (node1 != null) {
     length1++;
     node1 = node1.nextNode;
     }
     while (node2 != null) {
     length2++;
     node2 = node2.nextNode;
     }

     if (length1 > length2) {
     int index = length1 - length2;
     // 让长的链表先走完差值
     while (index > 0) {
     index--;
     node1 = node1.nextNode;
     }

     } else {
     int index = length2 - length1;
     while (index != 0) {
     index--;
     node2 = node2.nextNode;
     }
     }
     while (node1 != null && node2 != null) {
     if (node1 == node2) {
     result = node1;
     break;
     }
     node1 = node1.nextNode;
     node2 = node2.nextNode;
     }
     return result;
     } */

    /**
     * 另一个方法是可以使用栈：分别使用两个栈来保存两条链表；然后开始同时出栈，直到找到最后一个相同的节点
     * @param node1
     * @param node2
     * @return
     */
    /**
     private static ListNode getTheFristNodeByStack(ListNode node1, ListNode node2) {
     ListNode result = null;
     if (node1 == null || node2 == null) {
     return null;
     }
     Stack<ListNode> stack1 = new Stack<>();
     Stack<ListNode> stack2 = new Stack<>();

     while (node1 != null) {
     stack1.push(node1);
     node1 = node1.nextNode;
     }
     while (node2 != null) {
     stack2.push(node2);
     node2 = node2.nextNode;
     }
     while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
     stack1.pop();
     result = stack2.pop();
     }
     return result;
     }*/
}
