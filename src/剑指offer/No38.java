package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No38 {
    List<String> list=new ArrayList<>();
    public String[] permutation(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        helper(new boolean[c.length],c,0,"");
        return list.toArray(new String[list.size()]);

    }
    public void helper(boolean[] used,char[] ch,int index,String str){
        if(index==ch.length){
            list.add(str);
            return;
        }
        for(int i=0;i<ch.length;i++){
            if(!used[i]){
                if(i>0&&ch[i]==ch[i-1]&&!used[i-1]){
                    continue;
                }
                used[i]=true;
                helper(used,ch,index+1,str+ch[i]);
                used[i]=false;
            }
        }
    }
}
