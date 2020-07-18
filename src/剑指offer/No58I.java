package 剑指offer;

public class No58I {
    public String reverseWords(String s) {
        String[] strs=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=strs.length-1;i>=0;i--){
            if(strs[i].length()!=0&&!strs[i].equals(" ")){
                sb.append(strs[i].trim());
                if(i!=0){
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
