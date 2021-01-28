package learn.offer;

/**
 * 链表中倒数第K个节点
 * 剑指offer 15
 */
public class Test15 {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,9,6,7,8};
        Test05.ListNode first = new Test05.ListNode(arr[0]);
        Test05.ListNode tmp = first;
        for (int i = 1; i < arr.length; i++) {
            tmp.nextNode = new Test05.ListNode(arr[i]);
            tmp = tmp.nextNode;
        }
        Test05.ListNode x = findK(first, 3);
        System.out.println(x.nodeValue);
    }

    private static Test05.ListNode findK(Test05.ListNode head, int k) {

        if (head == null || k <= 0) {
            return null;
        }

        Test05.ListNode p1 = head;
        Test05.ListNode p2 = head;
        // 定义两个指针，从开头开始走，p1指针每次走k步，p2指针每次走1步，因此p1与p2的距离保持在k-1，当p1走到最后一个指针时，p2指针所指的就是倒数第K个节点
        while (k-- > 1) {
            if (p1.nextNode != null) {
                p1 = p1.nextNode;
            } else {
                return null;
            }
        }
        while (p1.nextNode != null) {
            p1 = p1.nextNode;
            p2 = p2.nextNode;
        }
        return p2;

    }
}
