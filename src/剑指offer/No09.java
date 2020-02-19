package 剑指offer;

import java.util.Stack;

/**
 * 题目：用两个栈实现队列
 */
public class No09 {
    class CQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public CQueue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void appendTail(int value) {
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            stack1.push(value);

        }

        public int deleteHead() {
            int res=0;
            if(stack1.isEmpty()&&stack2.isEmpty()){
                return -1;
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                res=stack2.pop();

            }
            return res;
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
