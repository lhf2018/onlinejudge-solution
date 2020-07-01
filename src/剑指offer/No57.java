package 剑指offer;

public class No57 {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                break;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{nums[start],nums[end]};
    }
}
