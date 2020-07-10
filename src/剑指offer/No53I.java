package 剑指offer;

public class No53I {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        int res=0;
        while(l<nums.length&&nums[l++]==target){
            res++;
        }
        return res;
    }
}
