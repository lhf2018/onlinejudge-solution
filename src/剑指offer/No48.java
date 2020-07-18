package 剑指offer;

import java.util.HashMap;
import java.util.Map;

public class No48 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int first=0;
        int second=0;
        Map<Character,Integer> map=new HashMap<>();
        int max=1;
        while(first<s.length()){
            if(map.containsKey(s.charAt(first))){
                second=Math.max(second,map.get(s.charAt(first))+1);
            }
            map.put(s.charAt(first),first);
            max=Math.max(max,first-second+1);
            // System.out.println(max+" "+second+" "+s.charAt(first));
            first++;
        }
        return max;
    }
}
