package 剑指offer;

/**
 * 题目：打印从1到最大的n位数
 */
public class No17 {
    class Solution {
        public int[] printNumbers(int n) {
            int up=(int)(Math.pow(10,n))-1;
            int[] res=new int[up];
            for(int i=0;i<up;i++){
                res[i]=i+1;
            }
            return res;
        }
    }
}
