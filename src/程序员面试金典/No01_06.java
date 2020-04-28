package 程序员面试金典;

public class No01_06 {
    class Solution {
        public String compressString(String S) {
            if(S.length()<2)return S;
            StringBuilder res=new StringBuilder();
            int count=1;
            char pre=S.charAt(0);
            char[] s=S.toCharArray();
            for(int i=1;i<s.length;i++){
                if(s[i]!=pre){
                    res.append(pre).append(count);
                    count=1;
                    pre=s[i];
                }else if(s[i]==pre){
                    count++;
                }
            }
            res.append(pre).append(count);
            // System.out.println(res);
            return res.length()>=S.length()?S:res.toString();
        }
    }
}
