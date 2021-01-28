package learn.offer;

import java.util.Stack;


/**
 * @author liangxuanhao
 * @date 2018年07月05日  9:39
 */
public class Test05 {


    public static void main(String[] args) {

//        ListNode root = new ListNode();
//        root.val = 1;
//        root.next = new ListNode();
//        root.next.val = 2;
//        root.next.next = new ListNode();
//        root.next.next.val = 3;
//        root.next.next.next = new ListNode();
//        root.next.next.next.val = 4;
//        root.next.next.next.next = new ListNode();
//        root.next.next.next.next.val = 5;
//        ListNode root = new ListNode();
//        for(int i = 0; i < 7; i++) {
//            root.nodeValue = i;
//            root.nextNode = new ListNode();
//        }
//
//        printUsedByWhile(root);
//        System.out.println();
//        printUsedByRecure(root);


    }
    /**
     * 定义链表节点结构
     */
    public static class ListNode {
        int nodeValue; //节点值
        ListNode nextNode; //下一个节点

        ListNode(int nodeValue) {
            this.nodeValue = nodeValue;
        }
    }
    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用栈的方式进行(循环方法)
     *
     * @param root 链表头结点
     */
    public static void printUsedByWhile(ListNode root) {


        Stack<ListNode> stack = new Stack<>();
        while(root != null) {       //循环链表入栈
            stack.push(root);       //入栈
            root = root.nextNode;       //指向下一个节点
        }

        //循环输出栈值
        ListNode tmp;
        while(!stack.isEmpty()) {
            tmp = stack.pop();
            System.out.print(tmp.nodeValue + " ");

        }
    }


    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用栈的方式进行(递归方法)
     * 递归本来就是一个栈结构，反向输出链表的时候进行递归，先输出当前节点的下一个节点值，再输出当前节点
     * @param root 链表头结点
     */
    public static void printUsedByRecure(ListNode root) {

        if(root != null) {
            printUsedByRecure(root.nextNode);
            System.out.print(root.nodeValue + " ");

        }
    }
}
