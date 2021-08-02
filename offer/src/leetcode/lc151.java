package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author yexiangyu
 * @description 翻转字符串里的单词
 * @apiNote
 */
public class lc151 {
    public static void main(String[] args) {
        String s = "   the sky  is blue   ";
        String res = reverseWords(s);
        System.out.println(res);

    }

    public static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strs = s.trim().split(" ");

        for(int i= strs.length-1; i>=0; i--){
            if(strs[i].length()>=1){
                builder.append(strs[i]);
                if(i>0){
                    builder.append(" ");
                }
            }
        }

        return builder.toString();
    }
}
