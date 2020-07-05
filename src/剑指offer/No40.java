package 剑指offer;

import java.util.Arrays;
import java.util.PriorityQueue;

public class No40 {
    /**
     * 方法一
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2)->o2-o1);
        for(int i=0;i<arr.length;i++){
            queue.offer(arr[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
    /**
     * 方法二
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
    }
}
