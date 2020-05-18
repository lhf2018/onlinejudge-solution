package 剑指offer;

public class No10II {
    public int numWays(int n) {
        if(n==0||n==1)return 1;
        int[] nums=new int[n+1];
        nums[1]=1;
        nums[2]=2;
        for(int i=3;i<=n;i++){
            nums[i]=(nums[i-1]+nums[i-2])%1000000007;
        }
        return nums[n];
    }
}
