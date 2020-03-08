package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class No57II {
    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> list=new ArrayList<>();
            int start=1;
            int end=2;
            while(start<end){
                int total=(end+start)*(end-start+1)/2;
                if(total==target){
                    int[] temp=new int[end-start+1];
                    int i=0;
                    for(int k=start;k<=end;k++){
                        temp[i++]=k;
                    }
                    list.add(temp);
                    start++;
                }else if(total>target){
                    start++;
                }else{
                    end++;
                }
            }
            return list.toArray(new int[list.size()][]);
        }
    }
}
