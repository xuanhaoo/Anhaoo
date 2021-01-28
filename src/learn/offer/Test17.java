package learn.offer;

import learn.offer.Test05.ListNode;

/**
 * @title: 合并两个递增排序的链表，确保合并后的链表仍然是递增的
 * @Description: 剑指offer 17
 * @Author: liangxuanhao
 * @Date: 2018-12-05 16:17
 */
public class Test17 {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,5,8,10};

        ListNode node1 = new ListNode(arr1[0]);
        ListNode tmp1 = node1;
        for (int i = 1; i < arr1.length; i++) {
            tmp1.nextNode = new ListNode(arr1[i]);
            tmp1 = tmp1.nextNode;
        }
        ListNode node2 = new ListNode(arr2[0]);
        ListNode tmp2 = node2;
        for (int j = 1; j < arr2.length; j++) {
            tmp2.nextNode = new ListNode(arr2[j]);
            tmp2 = tmp2.nextNode;
        }
        ListNode x = mergeList(node1, node2);
        int ll = arr1.length + arr2.length;
        for (int i = 0; i < ll; i++) {
            System.out.print(x.nodeValue+ ",");
            x = x.nextNode;
        }
    }

    /**
     * 递归法合并
     * @param node1
     * @param node2
     * @return
     */
    private static ListNode mergeList(ListNode node1, ListNode node2) {
        if (node1 != null && node2 == null) {
            return node1;
        } else if (node1 == null && node2 != null) {
            return node2;
        } else if (node1 == null && node2 == null) {
            return null;
        }

        // 合并后的链表
        ListNode mergeNode = null;
        if (node1.nodeValue <= node2.nodeValue) {
            mergeNode = node1;
            mergeNode.nextNode = mergeList(node1.nextNode, node2);
        } else {
            mergeNode = node2;
            mergeNode.nextNode = mergeList(node1, node2.nextNode);
        }
        return mergeNode;


    }
}

