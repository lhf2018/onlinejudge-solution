package 剑指offer;

public class No29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int[] res=new int[row*col];
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        int index=0;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                res[index++]=matrix[top][i];
            }
            for(int i=top+1;i<=bottom;i++){
                res[index++]=matrix[i][right];
            }
            if(left<right&&top<bottom){
                for(int i=right-1;i>=left;i--){
                    res[index++]=matrix[bottom][i];
                }
                for(int i=bottom-1;i>top;i--){
                    res[index++]=matrix[i][left];
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return res;
    }
}
