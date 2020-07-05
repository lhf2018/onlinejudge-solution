package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class No32III {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root,0);
        return res;
    }
    public void helper(TreeNode root,int level){
        if(root==null)return;
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        if(level%2==0){
            res.get(level).add(root.val);
        }else{
            res.get(level).add(0,root.val);
        }
        helper(root.left,level+1);
        helper(root.right,level+1);
    }
}
