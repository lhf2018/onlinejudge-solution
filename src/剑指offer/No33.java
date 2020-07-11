package 剑指offer;

public class No33 {
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder,0,postorder.length-1);
    }
    public boolean helper(int[] postorder,int start,int end){
        if(start>=end)return true;
        int index=start;
        int rootval=postorder[end];
        for(int i=start;i<end;i++){
            if(rootval<postorder[i]){
                break;
            }
            index++;
        }

        for(int i=index;i<end;i++){
            if(postorder[i]<rootval){
                // System.out.println(index+"  "+rootval);
                return false;
            }
        }
        return helper(postorder,start,index-1)&&helper(postorder,index,end-1);
    }
}
