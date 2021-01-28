package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月23日 09:35
 */
public class Question24 {

    public static void main(String[] args) {

    }

    /**
     * 两两交换链表节点
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
