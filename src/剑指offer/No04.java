package 剑指offer;

/**
 * 模拟成一颗二叉搜索树
 */
public class No04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
