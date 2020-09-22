package 剑指offer;

public class No61 {
    public boolean isStraight(int[] nums) {
        int[] arr=new int[14];
        for(int n:nums){
            arr[n]++;
            if(n!=0&&arr[n]>1){
                return false;
            }
        }
        int pre=-1;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(pre==-1&&arr[i]==1){
                pre=i;
            }else if(pre!=-1&&arr[i]==1){
                count+=(i-pre-1);
                pre=i;
            }

        }
        return count==0||arr[0]>=count;
    }
}
