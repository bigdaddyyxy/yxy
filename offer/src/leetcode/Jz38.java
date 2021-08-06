package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yexiangyu
 * @description 字符串的排列
 * @apiNote
 */
public class Jz38 {
    public static void main(String[] args) {
        String s = "abc";
        String[] strings = permutation(s);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
    static boolean[] used;
    static Set<String> res = new HashSet<>();
    public static String[] permutation(String s) {
        if(s.length()==1){
            return new String[]{s};
        }

        int n = s.length();
        used = new boolean[n];
        for(int i=0;i<n;i++){
            dfs(s,i, new StringBuilder());
        }
        String[] result = new String[res.size()];
        return res.toArray(result);
    }

    public static void dfs(String s, int index, StringBuilder builder){
        if(used[index]){
            return;
        }

        builder.append(s.charAt(index));
        used[index] = true;
        if(builder.length() == s.length()){
            res.add(builder.toString());
        }else{
            for(int i=0;i<s.length();i++){
                if(i==index){
                    continue;
                }
                dfs(s,i,builder);
            }
        }

        builder.deleteCharAt(builder.length()-1);
        used[index] = false;
    }
}
