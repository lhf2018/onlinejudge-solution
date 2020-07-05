package 剑指offer;

public class No21 {
    public int[] exchange(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            while(start<end&&(nums[start]&1)==1)start++;
            while(end>start&&(nums[end]&1)==0)end--;
            if(start<end){
                int temp=nums[end];
                nums[end]=nums[start];
                nums[start]=temp;
            }
        }
        return nums;
    }
}
