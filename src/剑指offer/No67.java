package 剑指offer;

public class No67 {
    public int strToInt(String str) {
        str=str.trim();
        boolean isNegative=false;
        int i=0;
        int j=0;
        long res=0;
        if(str.length()==0){
            return 0;
        }
        char[] ch=str.toCharArray();
        if(ch[0]!='-'&&ch[0]!='+'&&!Character.isDigit(ch[0])){
            return 0;
        }
        if(ch[0]=='-'){
            isNegative=true;
            i++;
        }else if(ch[0]=='+'){
            i++;
        }
        while(i<str.length()&&Character.isDigit(ch[i])){
            res=res*10+(ch[i++]-'0');
            if(res>Integer.MAX_VALUE && isNegative==false) return Integer.MAX_VALUE;
            if(res>Integer.MAX_VALUE && isNegative==true) return Integer.MIN_VALUE;
        }
        return isNegative==false?(int)res:(int)-res;
    }
}
