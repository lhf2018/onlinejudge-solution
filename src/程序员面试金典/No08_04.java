package 程序员面试金典;

import java.util.ArrayList;
import java.util.List;

public class No08_04 {
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(0,nums,new ArrayList<>());
        return res;
    }
    public void helper(int index,int[] nums,List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            helper(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}
