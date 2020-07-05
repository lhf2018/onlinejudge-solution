package 剑指offer;

public class No49 {
    public int nthUglyNumber(int n) {
        int two=0;
        int three=0;
        int five=0;
        int[] arr=new int[n];
        arr[0]=1;
        int start=1;
        int min=1;
        while(start<n){
            min=Math.min(arr[two]*2,Math.min(arr[three]*3,arr[five]*5));
            if(min==arr[two]*2){
                two++;
            }
            if(min==arr[three]*3){
                three++;
            }
            if(min==arr[five]*5){
                five++;
            }
            arr[start]=min;
            start++;
        }
        return arr[arr.length-1];
    }
}
