package learn.offer;


/**
 * 输出二叉树的镜像二叉树
 * 剑指offer 19
 */
public class Test19 {
    public static void mirrorTree(TreeNode treeNode) {
        // 判断该节点是否是叶子节点，其实镜像二叉树就是将非叶子节点的左右子树交换，递归过程
        if ((treeNode == null) || (treeNode.leftNode == null && treeNode.rightNode == null)) {
            return;
        }
        TreeNode tmp = null;
        tmp = treeNode.leftNode;
        treeNode.leftNode = treeNode.rightNode;
        treeNode.rightNode = tmp;
        if (treeNode.leftNode != null) {
            mirrorTree(treeNode.leftNode);
        }
        if (treeNode.rightNode != null) {
            mirrorTree(treeNode.rightNode);
        }
    }

}
