package 剑指offer;

/**
 * 题目：反转链表
 */
public class No24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre=null;
            ListNode cur=head;
            ListNode next=null;
            while(cur!=null){
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            return pre;
        }
    }
}
