package 程序员面试金典;

import java.util.Stack;

public class No03_05 {
    class SortedStack {
        Stack<Integer> stack;
        Stack<Integer> temp;
        public SortedStack() {
            stack=new Stack<>();
            temp=new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
        }

        public void pop() {
            if(!stack.isEmpty()){
                sort();
                stack.pop();
            }

        }

        public int peek() {
            if(stack.isEmpty())return -1;
            sort();
            return stack.peek();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
        public void sort(){
            int min=Integer.MAX_VALUE;
            while(!stack.isEmpty()){
                int node=stack.pop();
                min=Math.min(node,min);
                temp.push(node);
            }
            int count=0;
            while(!temp.isEmpty()){
                int node=temp.pop();
                if(node!=min){
                    stack.push(node);
                }else{
                    count++;
                }
            }
            for(int i=0;i<count;i++){
                stack.push(min);
            }
        }
    }
}
