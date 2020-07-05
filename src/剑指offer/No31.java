package 剑指offer;

import java.util.Stack;

public class No31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        int n=0;
        while(n<pushed.length){
            stack.push(pushed[n]);
            while(!stack.isEmpty()&&index<popped.length&&stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
            n++;
        }
        return index==popped.length;
    }
}
