package 剑指offer;

import java.util.PriorityQueue;
import java.util.Stack;

public class No30 {
    class MinStack {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Stack<Integer> stack=new Stack<>();
        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            queue.offer(x);
            stack.push(x);
        }

        public void pop() {
            int temp=stack.pop();
            queue.remove(temp);
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return queue.peek();
        }
    }
}
