package 剑指offer;

public class No28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode left,TreeNode right){
        if(left==null&&right==null)return true;
        if(left==null||right==null)return false;
        return left.val==right.val&&helper(left.left,right.right)&&helper(left.right,right.left);
    }
}
