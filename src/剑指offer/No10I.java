package 剑指offer;

public class No10I {
    class Solution {
        public int fib(int n) {
            if(n==0){
                return 0;
            }
            if(n==1||n==2){
                return 1;
            }
            int[] dp=new int[n+1];
            dp[1]=1;
            for(int i=2;i<=n;i++){
                dp[i]=(dp[i-1]+dp[i-2])%1000000007;
            }
            return dp[n];
        }
    }
}
