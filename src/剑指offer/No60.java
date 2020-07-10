package 剑指offer;

public class No60 {
    public double[] twoSum(int n) {
        // if(n==1)return new double[]{1.0};
        int[][] dp=new int[n+1][6 * n + 1];
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=6*n;j++){
                for(int m=1;m<j&&m<=6;m++){
                    dp[i][j]+=dp[i-1][j-m];
                }
            }
        }
        double[] res=new double[6*n-n+1];
        double total=Math.pow(6,n);
        for(int i=n;i<=6*n;i++){
            res[i-n]=dp[n][i]/total;
        }
        return res;
    }
}
