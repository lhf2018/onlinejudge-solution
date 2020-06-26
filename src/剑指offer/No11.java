package 剑指offer;

/**
 * 二分查找
 */
public class No11 {
    public int minArray(int[] numbers) {
        int l=0;
        int h=numbers.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(numbers[h]>numbers[mid]){
                h=mid;
            }else if(numbers[h]<numbers[mid]){
                l=mid+1;
            }else{
                h--;
            }
        }
        return numbers[l];

    }
}
