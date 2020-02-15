package 剑指offer;

/**
 * 题目： 数组中数字出现的次数 II LCOF
 * 参考解法：https://blog.csdn.net/yutianzuijin/article/details/50597413
 */
public class No56II {
    class Solution {
        public int singleNumber(int[] nums) {
            int low=0;
            int high=0;
            for(int num:nums){
                low=(low^num)&~high;
                high=(high^num)&~low;
            }
            return low;
        }
    }
}
