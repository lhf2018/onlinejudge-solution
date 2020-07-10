package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

public class No37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> queue=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode temp=queue.poll();
                if(temp!=null){
                    res.append(temp.val+" ");
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                }else{
                    res.append("null ");
                }
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))return null;
        data=data.trim();
        String[] nodes=data.split(" ");
        // for(String s:nodes){
        //     System.out.println(s);
        // }
        int index=1;
        TreeNode root=new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(index<nodes.length){
            TreeNode temp=queue.poll();
            if(!nodes[index].equals("null")){
                temp.left=new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(temp.left);

            }
            index++;
            if(!nodes[index].equals("null")){
                temp.right=new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(temp.right);
            }
            index++;
        }
        return root;
    }
}
