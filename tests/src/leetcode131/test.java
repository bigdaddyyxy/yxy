package leetcode131;

import java.util.ArrayList;
import java.util.List;

public class test {
    List<List<String>> res = new ArrayList<List<String>>();
    List<String> combine = new ArrayList<String>();
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> partition = partition(s);
        System.out.println(partition);

    }


    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> combine = new ArrayList<String>();
        backtrack(s,0,res,combine);
        return res;
    }


    public static void backtrack(String s, int index,List<List<String>> res,List<String> combine ){
        if(index == s.length()){
            res.add(new ArrayList<String>(combine));
            return;
        }
        for(int i=index+1;i<=s.length();i++){

            String cur = s.substring(index,i);
            if(isHui(cur)){
                combine.add(cur);
                backtrack(s,i,res,combine);
                combine.remove(combine.size()-1);
            }
        }

    }

    //是否回文串
    public static boolean isHui(String s){
        if(s.length()==1) return true;
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
