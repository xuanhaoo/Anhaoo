package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月22日 11:09
 */
public class Question19 {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(listNode, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        // 定义双指针
        ListNode p1 = head;
        ListNode p2 = head;
        while (n-- > 0) {
            p2 = p2.next;
        }
        // 快指针走完了，说明删除的是头结点
        if (p2 == null) {
            return head.next;
        }
        // 注意条件p2.next,因为要删除的节点，必须要找到前一个节点，然后将该节点的下一个节点指向再下一个节点
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        // 此时删除p1的下一个节点
        p1.next = p1.next.next;
        return head;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
