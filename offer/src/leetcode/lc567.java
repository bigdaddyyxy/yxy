package leetcode;

import java.util.Arrays;

/**
 * @author yexiangyu
 * @description 字符串的排列
 * @apiNote
 */
public class lc567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));

    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int m = s1.length();
        if(n<m){
            return false;
        }
        int[] target = new int[26];
        int[] nums = new int[26];

        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            int index = c-'a';
            target[index]++;
        }

        for(int i=0;i<m;i++){
            char c = s2.charAt(i);
            int index = c-'a';
            nums[index]++;
        }


        for(int i=0;i<=n-m;i++){

            if(i>0){
                nums[(s2.charAt(i-1)-'a')] --;
                nums[(s2.charAt(i+m-1)-'a')]++;
            }
            if(Arrays.equals(target,nums)){
                return true;
            }

        }
        return false;

    }
}
