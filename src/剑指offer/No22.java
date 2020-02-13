package 剑指offer;

/**
 * 题目：链表中倒数第k个节点
 */
public class No22 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode temp=head;
            int num=0;
            while(temp!=null){
                num++;
                temp=temp.next;
            }
            for(int i=0;i<num-k;i++){
                head=head.next;
            }
            return head;
        }
    }
}
