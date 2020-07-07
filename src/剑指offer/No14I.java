package 剑指offer;

public class No14I {
    /**
     * 方法一
     */
    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<i;j++){
                max=Math.max(max,Math.max(j,dp[j])*Math.max(i-j,dp[i-j]));
            }
            dp[i]=max;
        }
        return dp[n];
    }
    /**
     * 方法二
     */
    public int cuttingRope2(int n) {
        if(n==1||n==2)return 1;
        if(n==3)return 2;
        int sum=1;
        while(n>4){
            sum*=3;
            n-=3;
        }
        return sum*n;
    }
}
