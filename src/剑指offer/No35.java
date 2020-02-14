package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：复杂链表的复制
 */
public class No35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    class Solution {
        public Node copyRandomList(Node head) {
            int num=0;
            Node node=new Node(0);
            Node node1=node;
            Node node2=node;
            Map<Node,Node> map=new HashMap<>();
            Node st1=head;
            Node st2=head;
            while(st1!=null){
                node1.next=new Node(st1.val);
                map.put(st1,node1.next);
                st1=st1.next;
                node1=node1.next;
            }
            while(st2!=null){
                if(st2.random!=null){
                    node2.next.random=map.get(st2.random);
                }
                st2=st2.next;
                node2=node2.next;
            }
            return node.next;
        }
    }
}
