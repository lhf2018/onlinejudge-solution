package 剑指offer;

public class No56I {
    class Solution {
        public int[] singleNumbers(int[] nums) {
            int num1=0;
            int index=0;
            for(int i=0;i<nums.length;i++){
                num1^=nums[i];
            }
            while((num1&1)==0){
                index++;
                num1=(num1>>1);
            }
            int r1=0;
            int r2=0;
            for(int i=0;i<nums.length;i++){
                if(((nums[i]>>index)&1)==1){
                    r1^=nums[i];
                }else{
                    r2^=nums[i];
                }
            }
            return new int[]{r1,r2};
        }
    }
}
