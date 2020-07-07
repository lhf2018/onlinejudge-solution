package 剑指offer;

public class No46 {
    public int translateNum(int num) {
        if((num/10)==0)return 1;
        String str=String.valueOf(num);
        int[] dp=new int[str.length()];
        dp[0]=1;
        dp[1]=(str.charAt(0)-'0')*10+(str.charAt(1)-'0')<26?2:1;
        for(int i=2;i<dp.length;i++){
            int n=(str.charAt(i-1)-'0')*10+(str.charAt(i)-'0');
            if(n>=10&&n<26){
                dp[i]=dp[i-1]+dp[i-2];
            }else{
                dp[i]=dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
