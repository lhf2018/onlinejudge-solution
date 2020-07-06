package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class No34 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root,sum,new ArrayList<>());
        return res;
    }
    public void helper(TreeNode root,int sum,List<Integer> list){
        if(root==null)return;
        list.add(root.val);
        sum-=root.val;
        if(sum==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(list));
        }else{
            helper(root.left,sum,list);
            helper(root.right,sum,list);
        }
        list.remove(list.size()-1);
    }
}
