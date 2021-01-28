package learn.offer;

import learn.offer.Test05.ListNode;

/**
 * @title: 反转链表，输入一个链表的头结点，反转该链表
 * @Description: 剑指offer 16
 * @Author: liangxuanhao
 * @Date: 2018-12-05 15:48
 */
public class Test16 {

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,9,6,7,8};
        ListNode first = new ListNode(arr[0]);
        ListNode tmp = first;
        for (int i = 1; i < arr.length; i++) {
            tmp.nextNode = new ListNode(arr[i]);
            tmp = tmp.nextNode;
        }
        ListNode x = reverseList(first);
        System.out.println(x.nodeValue);
    }

    private static ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;

        // 遍历链表，将pre指针一步一步移到最后一个节点，head指针往后移
        while (head != null) {
            next = head.nextNode; // 1 取出head的下一个节点
            head.nextNode = pre;  // 2 反向指针
            pre = head;            // 3 交换head值
            head = next;            // 4 反向节点


        }
        return pre;
    }
}

