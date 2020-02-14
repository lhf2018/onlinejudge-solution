package 剑指offer;

/**
 * 题目：二进制中1的个数
 */
public class No15 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int res=0;
            while(n!=0){
                int temp=n&1;
                if(temp==1){
                    res++;
                }
                n=(n>>>1);
            }
            return res;
        }
    }
}
