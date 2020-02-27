package 程序员面试金典;

public class No16_01 {
    class Solution {
        public int[] swapNumbers(int[] numbers) {
            numbers[0]=numbers[0]^numbers[1];
            numbers[1]=numbers[0]^numbers[1];
            numbers[0]=numbers[0]^numbers[1];
            return numbers;
        }
    }
}
