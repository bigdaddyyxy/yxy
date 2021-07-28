package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yexiangyu
 * @description  无重复字符的最长字串
 * @apiNote
 */
public class lc03 {
    public static void main(String[] args) {
        String s = " ";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(n-i < maxLength){
                break;
            }

            set.add(s.charAt(i));
            for(int j=i+1;j<n;j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }else{
                    break;
                }
            }
            maxLength = Math.max(maxLength,set.size());
            set.clear();
        }

        return maxLength;

    }
}
