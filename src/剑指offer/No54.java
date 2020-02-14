package 剑指offer;

/**
 * 题目：二叉搜索树的第k大节点
 */
public class No54 {
    class Solution {
        private int res=0;
        private int cur=0;
        public int kthLargest(TreeNode root, int k) {
            helper(root,k);
            return res;
        }
        public void helper(TreeNode root,int k){
            if(root==null)return;
            helper(root.right,k);
            cur++;
            if(k==cur){
                res=root.val;
                return;
            }
            helper(root.left,k);
        }
    }
}
