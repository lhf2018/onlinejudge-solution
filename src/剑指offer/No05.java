package 剑指offer;

/**
 * 题目：替换空格
 */
public class No05 {
    class Solution {
        public String replaceSpace(String s) {
            return s.replaceAll(" ","%20");
        }
    }
}
