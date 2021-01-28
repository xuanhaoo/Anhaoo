package learn.leetCode;

import java.util.Objects;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月22日 11:47
 */
public class Question2 {

    public static void main(String[] args) {

    }


    /**
     * 链表两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1) && Objects.isNull(l2)) {
            return null;
        }

        ListNode resultRootNode = new ListNode(0);
        ListNode currentNode = resultRootNode;
        int x = 0;
        while (null != l1 || null != l2 || x > 0) {
            int l1val = null == l1 ? 0 : l1.val;
            int l2val = null == l2 ? 0 : l2.val;
            int tmp = l1val + l2val;
            if (x == 1) {
                tmp = tmp + 1;
                x = 0;
            }
            int tmpValue = 0;
            if (tmp >= 10) {
                tmpValue = tmp % 10;
                x = 1;
            } else {
                tmpValue = tmp;
            }
            ListNode sumNode = new ListNode(tmpValue);
            currentNode.next = sumNode;
            currentNode = sumNode;
            l1 = (null == l1) ? null : l1.next;
            l2 = (null == l2) ? null : l2.next;
        }
        return resultRootNode.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
