package 剑指offer;

public class No44 {
    public int findNthDigit(int n) {
        long b=1;
        int digit =1;
        long count=9;
        while(n>count){
            n-=count;
            digit+=1;
            b*=10;
            count=9*digit*b;
        }
        long temp=b+((n-1)/digit);
        return Long.toString(temp).charAt((n-1)%digit)-'0';

    }
}
