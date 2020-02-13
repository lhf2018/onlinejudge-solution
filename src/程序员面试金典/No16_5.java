package 程序员面试金典;

public class No16_5 {
    class Solution {
        public int trailingZeroes(int n) {
            int res=0;
            while(n!=0){
                n/=5;
                res+=n;
            }
            return res;
        }
    }
}
