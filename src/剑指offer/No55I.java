package 剑指offer;

/**
 * 题目：二叉树的深度
 */
public class No55I {
    class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            return 1+Math.max(left,right);
        }
    }
}
