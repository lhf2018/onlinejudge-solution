package 剑指offer;

public class No36 {
    Node pre;
    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        Node node=root;
        while(node.left!=null){
            node=node.left;
        }
        Node tail=root;
        while(tail.right!=null){
            tail=tail.right;
        }
        helper(root);
        tail.right=node;
        node.left=tail;
        return node;
    }
    public void helper(Node root){
        if(root==null)return;
        helper(root.left);
        if(pre!=null){
            pre.right=root;
        }
        root.left=pre;
        pre=root;
        helper(root.right);
    }
}
