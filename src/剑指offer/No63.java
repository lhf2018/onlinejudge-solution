package 剑指offer;

public class No63 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int res=0;
        int[] arr=new int[prices.length];
        arr[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            arr[i]=Math.min(arr[i-1],prices[i]);
            if(prices[i]-arr[i-1]>0){
                res=Math.max(res,prices[i]-arr[i-1]);
            }
        }
        return res;
    }
}
