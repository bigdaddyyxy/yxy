package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {


    public static void main(String[] args) {
        int left = 1;
        int right = 0;
        int n = 2;
        StringBuilder res = new StringBuilder();
        res.append('(');

        dfs(n,left,right,res);
    }




    public static void dfs(int n,int left, int right, StringBuilder s){
        if(right==n && left==n){
            System.out.println(s);
            return;
        }
        if(left==n && right<n) dfs(n,left,right+1,s.append(')'));

        if(left==right && left<n){
            dfs(n,left+1, right,s.append('('));
        }else{
            dfs(n,left+1,right,s.append('('));
            dfs(n,left,right+1,s.append(')'));
        }
        return;
    }
}
