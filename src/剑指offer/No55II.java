package 剑指offer;

public class No55II {
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return flag;
    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(Math.abs(left-right)>1){
            flag=false;
        }
        return Math.max(left,right)+1;
    }
}
