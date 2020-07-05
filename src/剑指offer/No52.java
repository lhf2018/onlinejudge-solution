package 剑指offer;

import java.util.Stack;

public class No52 {
    /**
     * 方法一：
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        Stack<ListNode> stackA=new Stack<>();
        Stack<ListNode> stackB=new Stack<>();
        while(headA!=null){
            stackA.push(headA);
            headA=headA.next;
        }
        while(headB!=null){
            stackB.push(headB);
            headB=headB.next;
        }
        ListNode pre=null;
        ListNode A;
        ListNode B;
        while(!stackA.isEmpty()&&!stackB.isEmpty()&&(A=stackA.pop())==(B=stackB.pop())){
            pre=A;
        }
        return pre;
    }
    /**
     * 方法二
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode node1=headA;
        ListNode node2=headB;
        while(node1!=node2){
            node1=(node1!=null?node1.next:headB);
            node2=(node2!=null?node2.next:headA);
        }
        return node1;
    }
}
