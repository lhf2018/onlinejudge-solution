package 剑指offer;

public class No53II {
    public int missingNumber(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]!=mid){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l==nums.length-1&&nums[l]==l?nums.length:l;
    }
}
