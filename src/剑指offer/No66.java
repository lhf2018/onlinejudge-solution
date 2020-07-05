package 剑指offer;

public class No66 {
    public int[] constructArr(int[] a) {
        if(a.length==0)return new int[0];
        int[] arr1=new int[a.length];
        int[] arr2=new int[a.length];
        arr1[0]=1;
        arr2[0]=1;
        for(int i=1;i<a.length;i++){
            arr1[i]=arr1[i-1]*a[i-1];
            arr2[i]=arr2[i-1]*a[a.length-i];
        }
        int[] res=new int[a.length];
        for(int i=0;i<res.length;i++){
            res[i]=arr1[i]*arr2[res.length-1-i];
        }
        return res;
    }
}
