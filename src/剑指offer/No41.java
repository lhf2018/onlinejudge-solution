package 剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class No41 {
    class MedianFinder {
        PriorityQueue<Double> small;
        PriorityQueue<Double> big;
        /** initialize your data structure here. */
        public MedianFinder() {
            small=new PriorityQueue<>();
            big=new PriorityQueue<Double>(Comparator.reverseOrder());
        }

        public void addNum(int num) {
            big.offer(num*1.0);
            small.offer(big.poll());
            if(small.size()-big.size()>1){
                big.offer(small.poll());
            }
        }

        public double findMedian() {
            if(((small.size()+big.size())&1)==1){
                // System.out.println(big.size()+"  "+small.size());
                return small.peek();
            }else{
                return (small.peek()+big.peek())/2;
            }
        }
    }
}
