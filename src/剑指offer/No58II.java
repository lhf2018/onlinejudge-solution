package 剑指offer;

/**
 * 题目：左旋转字符串
 */
public class No58II {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n)+s.substring(0,n);
        }
    }
}
