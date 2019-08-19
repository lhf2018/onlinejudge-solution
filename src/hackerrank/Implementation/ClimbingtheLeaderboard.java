package hackerrank.Implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路见个人博客：https://blog.csdn.net/weixin_44128511/article/details/99729021
 */
public class ClimbingtheLeaderboard {
    /**
     * 只包含climbingLeaderboardhans函数
     */
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> list=new ArrayList<>();
        int[] res=new int[alice.length];
        for(int i=0;i<scores.length;i++){
            if(i>0){
                if(scores[i]!=list.get(list.size()-1)){
                    list.add(scores[i]);
                }
            }else{
                list.add(scores[i]);
            }
        }

        int temp=list.get(list.size()-1);
        for(int i=0;i<alice.length;i++){
            while(list.size()>0&&alice[i]>list.get(list.size()-1)){
                temp=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
            if(list.size()==0){
                if(temp<alice[i]){
                    res[i]=1;
                }else{
                    res[i]=2;
                }
            }else if(alice[i]==list.get(list.size()-1)){
                res[i]=list.size();
            }else{
                res[i]=list.size()+1;
            }
        }

        return res;
    }
}
