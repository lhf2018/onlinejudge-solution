package 剑指offer;

/**
 * 题目：重建二叉树
 */
public class No07 {
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        }
        public TreeNode helper(int[] pre, int[] in,int prestart,int preend,int instart,int inend){
            if(prestart>preend||instart>inend){
                return null;
            }
            TreeNode root=new TreeNode(pre[prestart]);
            int index=prestart;
            for(int i=instart;i<=inend;i++){
                if(in[i]==pre[prestart]){
                    index=i;
                    break;
                }
            }
            root.left=helper(pre,in,prestart+1,prestart+index-instart,instart,index-1);
            root.right=helper(pre,in,prestart+index-instart+1,preend,index+1,inend);
            return root;
        }
    }
}
