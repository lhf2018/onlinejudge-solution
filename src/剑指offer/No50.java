package 剑指offer;

public class No50 {
    public char firstUniqChar(String s) {
        int[] ch=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(ch[c-'a']==1){
                return c;
            }
        }
        return ' ';
    }
}
