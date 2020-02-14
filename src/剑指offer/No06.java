package 剑指offer;

/**
 * 题目：从尾到头打印链表
 */
public class No06 {
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode temp=head;
            int len=0;
            while(temp!=null){
                temp=temp.next;
                len++;
            }
            int[] res=new int[len];
            int n=len-1;
            while(head!=null){
                res[n--]=head.val;
                head=head.next;
            }
            return res;
        }
    }
}
