package 剑指offer;

public class No43 {
    /**
     * 题解：https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/solution/mian-shi-ti-43-1n-zheng-shu-zhong-1-chu-xian-de-2/
     */
    public int countDigitOne(int n) {
        int digital=1;
        int low=0;
        int high=n/10;
        int cur=n%10;
        int res=0;
        while(high!=0||cur!=0){
            if(cur==0){
                res+=high*digital;
            }else if(cur==1){
                res+=(high*digital+1+low);
            }else{
                res+=(high+1)*digital;
            }
            low+=cur*digital;
            cur=high%10;
            high/=10;
            digital*=10;

        }
        return res;
    }
}
