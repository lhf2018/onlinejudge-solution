package 剑指offer;

public class No65 {
    public int add(int a, int b) {
        int c=0;
        while(b!=0){
            c=(a&b)<<1;
            a^=b;
            b=c;
        }
        return a;
    }
}
