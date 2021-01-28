package learn.offer;

/**
 * @title: 输入两颗二叉树A和B，判断B树是不是A树的子树
 * @Description: 剑指offer 18
 * @Author: liangxuanhao
 * @Date: 2018-12-05 17:01
 */
public class Test18 {


    public static void main(String[] args) {

    }

    private static boolean judgeTreeNode(TreeNode treeNodeA, TreeNode treeNodeB) {
        if (treeNodeA == null || treeNodeB == null) {
            return false;
        }
        return isSubTree(treeNodeA, treeNodeB) || judgeTreeNode(treeNodeA.leftNode, treeNodeB) || judgeTreeNode(treeNodeA.rightNode, treeNodeB);
    }

    private static boolean isSubTree(TreeNode treeNodeA, TreeNode treeNodeB) {
        if (treeNodeB == null) {
            return true;
        }
        if (treeNodeA == null) {
            return false;
        }
        if (treeNodeA.nodeValue ==  treeNodeB.nodeValue) {
            return isSubTree(treeNodeA.leftNode, treeNodeB.leftNode) && isSubTree(treeNodeA.rightNode, treeNodeB.rightNode);
        }
        return false;
    }

}
class TreeNode {
    int nodeValue;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int nodeValue) {
        this.nodeValue = nodeValue;
    }
}
