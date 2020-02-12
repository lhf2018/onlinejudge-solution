package codingInterviews;

/**
 * 题目：求1+2+…+n
 * 思路：使用递归
 */
public class No64 {
    class Solution {
        public int sumNums(int n) {
            if(n==1)return 1;
            return n+sumNums(n-1);
        }
    }
}
