package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class No59II {
    class MaxQueue {
        Queue<Integer> queue;
        Deque<Integer> deque;
        public MaxQueue() {
            queue=new LinkedList<>();
            deque=new LinkedList<>();
        }

        public int max_value() {
            if(queue.size()==0){
                return -1;
            }
            return deque.peekFirst();
        }

        public void push_back(int value) {
            queue.offer(value);
            while(!deque.isEmpty()&&deque.peekLast()<value){
                deque.pollLast();
            }
            deque.offerLast(value);
        }

        public int pop_front() {
            if(queue.size()==0){
                return -1;
            }
            int temp=queue.poll();
            if(temp==deque.peekFirst()){
                deque.pollFirst();
            }
            return temp;
        }
    }
}
