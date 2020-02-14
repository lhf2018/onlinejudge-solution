package 剑指offer;

/**
 * 题目：合并两个排序的链表
 */
public class No25 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode res=new ListNode(0);
            ListNode head=res;
            while(l1!=null&&l2!=null){
                if(l1.val<l2.val){
                    res.next=new ListNode(l1.val);
                    l1=l1.next;
                }else{
                    res.next=new ListNode(l2.val);
                    l2=l2.next;
                }
                res=res.next;
            }
            if(l1!=null){
                res.next=l1;
            }
            if(l2!=null){
                res.next=l2;
            }
            return head.next;
        }
    }
}
