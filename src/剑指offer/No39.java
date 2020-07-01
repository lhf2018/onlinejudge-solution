package 剑指offer;

public class No39 {
    public int majorityElement(int[] nums) {
        int pre=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==pre){
                count++;
            }else{
                count--;
            }
            if(count==0){
                count=1;
                pre=nums[i];
            }
        }
        return pre;
    }
}
