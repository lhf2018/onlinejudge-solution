package topcoder;

import java.util.*;

/**
 * 思路：创建一个质数数组，每一位字母代表一个质数，同一些字母的不同组合的质数积是固定且不会相同的，使用hashset检查唯一性
 */
public class Aaagmnrs{
    public String[] anagrams(String[] phrases){
        Set<Long> set=new HashSet<>();
        List<String> list=new ArrayList<>();
        int[] le=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for(int i=0;i<phrases.length;i++){
            long temp= 1L;
            String str=phrases[i].trim().toLowerCase();
            for(int j=0;j<phrases[i].length();j++){
                if(str.charAt(j)==' ')continue;
                temp*=le[str.charAt(j)-'a'];
            }
            if(!set.contains(temp)){
                list.add(phrases[i]);
                set.add(temp);
            }
        }
        String[] res=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        Aaagmnrs aaagmnrs=new Aaagmnrs();
        System.out.println(Arrays.toString(aaagmnrs.anagrams(new String[]{ "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" })));
    }
}