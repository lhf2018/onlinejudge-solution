package 剑指offer;

public class No18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode res=head;
        while(res.next.val!=val){
            res=res.next;
        }
        res.next=res.next.next;
        return head;
    }
}
