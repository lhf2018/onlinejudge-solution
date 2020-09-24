package 剑指offer;

public class No12 {
    public boolean exist(char[][] board, String word) {
        char[] chs=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(chs[0]==board[i][j]&&helper(board,chs,i,j,0,new boolean[board.length][board[0].length])){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, char[] chs,int row,int col,int index,boolean[][] used){
        if(index>=chs.length){
            return true;
        }
        if(row<0||row>=board.length||col<0||col>=board[0].length){
            return false;
        }

        if(!used[row][col]&&chs[index]==board[row][col]){
            used[row][col]=true;
            boolean res= helper(board,chs,row-1,col,index+1,used)||
                    helper(board,chs,row+1,col,index+1,used)||
                    helper(board,chs,row,col-1,index+1,used)||
                    helper(board,chs,row,col+1,index+1,used);
            used[row][col]=false;
            return res;
        }
        return false;

    }
}
