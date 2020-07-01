package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No32I {
    public int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
