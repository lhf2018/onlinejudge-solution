package 剑指offer;

/**
 * 题目：数组中重复的数字
 */
public class No03 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            for(int i=0;i<nums.length;i++){
                while(i!=nums[i]){
                    if(nums[i]==nums[nums[i]]){

                        return nums[i];
                    }

                    int temp=nums[i];
                    nums[i]=nums[nums[i]];
                    nums[temp]=temp;
                }

            }
            return -1;
        }
    }
}
