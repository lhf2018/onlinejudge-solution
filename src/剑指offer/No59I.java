package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;

public class No59I {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums.length==0||k==0){
                return new int[0];
            }
            int[] res=new int[nums.length-k+1];
            Deque<Integer> deque=new LinkedList<>();
            int index=0;
            for(int i=0;i<nums.length;i++){
                while(!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i]){
                    deque.pollLast();
                }
                deque.addLast(i);
                if(deque.peekFirst()==i-k){
                    deque.pollFirst();
                }
                if(i>=(k-1)){
                    res[index++]=nums[deque.peekFirst()];
                }
            }
            return res;
        }
    }
}
