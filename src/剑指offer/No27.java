package 剑指offer;

/**
 * 题目：二叉树的镜像
 */
public class No27 {
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if(root==null)return null;
            TreeNode left=mirrorTree(root.right);
            TreeNode right=mirrorTree(root.left);
            root.left=left;
            root.right=right;
            return root;
        }
    }
}
