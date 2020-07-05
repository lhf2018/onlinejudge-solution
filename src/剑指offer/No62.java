package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class No62 {
    /**
     * 方法一
     */
    public int lastRemaining(int n, int m) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int index=0;
        while(list.size()!=1){
            index=(index+m-1)%list.size();
            list.remove(index);
        }
        return list.get(0);
    }
    /**
     * 方法二
     * 解法讲解：https://blog.csdn.net/u011500062/article/details/72855826
     */
    public int lastRemaining2(int n, int m) {
        int p=0;
        for(int i=2;i<=n;i++){
            p=(p+m)%i;
        }
        return p;
    }
}
