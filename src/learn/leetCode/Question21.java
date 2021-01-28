package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月06日 22:14
 */
public class Question21 {


    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode resultListNode = new ListNode();
//        if (l1.val < l2.val) {
//            resultListNode.val = l1.val;
//        } else {
//            resultListNode.val = l2.val;
//        }
        while (l1 != null && l2 != null) {
             // 1 3 5 // 4 5 6
            if (l1.val <= l2.val) {
                resultListNode.val = l1.val;
                l1 = l1.next;
            }
            if (l1.val > l2.val) {
                resultListNode.val = l2.val;
                l2 = l2.next;
            }
            resultListNode = resultListNode.next;
        }

        return resultListNode;


    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
