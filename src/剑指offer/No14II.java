package 剑指offer;

public class No14II {
    public int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        long res=1;
        while(n>4){
            res*=3;
            n-=3;
            res%=1000000007;
        }
        return (int)((n*res)%1000000007);
    }
}
