package 剑指offer;

public class No13 {
    public int movingCount(int m, int n, int k) {
        return helper(new boolean[m][n],0,0,m,n,k);
    }
    public int helper(boolean[][] visited,int i,int j,int m,int n,int k){
        if(i<0||i>=m||j<0||j>=n||visited[i][j]||sum(i,j)>k)return 0;
        visited[i][j]=true;
        return helper(visited,i-1,j,m,n,k)+helper(visited,i,j-1,m,n,k)
                +helper(visited,i+1,j,m,n,k)+helper(visited,i,j+1,m,n,k)+1;
    }
    public int sum(int i,int j){
        int res=0;
        while(i!=0){
            res+=(i%10);
            i/=10;
        }
        while(j!=0){
            res+=(j%10);
            j/=10;
        }
        return res;
    }
}
