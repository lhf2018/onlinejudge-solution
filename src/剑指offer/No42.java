package 剑指offer;

public class No42 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int n:nums){
            if(sum<0){
                sum=n;
            }else{
                sum+=n;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
