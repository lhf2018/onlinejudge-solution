package 剑指offer;

import java.util.Arrays;
import java.util.Comparator;

public class No45 {
    // 对排序接口重写的依据：https://blog.csdn.net/qq_29742677/article/details/84255720
    public String minNumber(int[] nums) {
        String[] strs=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,new Comparator<String>(){
            public int compare(String a,String b){
                return (a+b).compareTo(b+a);
            }
        });
        return String.join("",strs);
    }
}
