package 剑指offer;

public class No16 {
    public double myPow(double x, int n) {
        if(n==-1)return 1.0/x;
        if(n==1)return x;
        if(n==0)return 1;
        if(n%2==0){
            double temp=myPow(x,n/2);
            return temp*temp;
        }
        if(n>0){
            double temp=myPow(x,(n-1)/2);
            return x*temp*temp;
        }else{
            double temp=myPow(x,(n+1)/2);
            return (1.0/x)*temp*temp;
        }

    }
}
