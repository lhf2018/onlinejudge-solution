package 程序员面试金典;

import java.util.*;

/**
 * 滑动窗口思想
 * 题解：https://leetcode-cn.com/problems/shortest-supersequence-lcci/solution/chao-xiang-xi-jie-fa-yi-ding-neng-kan-dong-by-yuan/
 * 滑动窗口类型题目解析：https://leetcode-cn.com/problems/minimum-window-substring/solution/zui-xiao-fu-gai-zi-chuan-by-leetcode-2/
 */
public class No17_18 {
    class Solution {
        public int[] shortestSeq(int[] big, int[] small) {
            int left=0;
            Set<Integer> setsmall=new HashSet<>();
            Set<Integer> setbig=new HashSet<>();
            Map<Integer,Integer> map=new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<small.length;i++){
                setsmall.add(small[i]);
            }
            int min=Integer.MAX_VALUE;
            int start=-1;
            int end=-1;
            for(int i=0;i<big.length;i++){
                if(setsmall.contains(big[i])){
                    list.add(i);
                    setbig.add(big[i]);
                    map.put(big[i],map.getOrDefault(big[i],0)+1);
                    if(setsmall.size()==setbig.size()){
                        while(true){
                            // left=list.remove(0);
                            if(!setsmall.contains(big[left])){
                                left++;
                                continue;
                            }
                            int count=map.get(big[left])-1;
                            map.put(big[left],count);
                            left++;
                            if(count==0){
                                setbig.remove(big[left-1]);
                                break;
                            }
                        }
                        if(i-left<min){
                            start=left-1;
                            end=i;
                            min=i-left;
                        }
                    }
                }
            }
            return min==Integer.MAX_VALUE?new int[0]:new int[]{start,end};
        }
    }
}
