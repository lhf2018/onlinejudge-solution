package 程序员面试金典;

import java.util.HashSet;
import java.util.Set;

public class No02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null)return null;
        ListNode fast=head.next;
        ListNode slow=head;
        Set<Integer> set=new HashSet<>();
        set.add(head.val);
        while(fast!=null){
            while(fast!=null&&set.contains(fast.val)){
                fast=fast.next;
            }
            slow.next=fast;
            slow=slow.next;
            if(fast!=null){
                set.add(fast.val);
                fast=fast.next;
            }
        }
        return head;
    }
}
