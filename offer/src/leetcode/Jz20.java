package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yexiangyu
 * @description 表示数值的字符串
 * @apiNote
 */
public class Jz20 {
    public static void main(String[] args) {
        String s = "1 ";
        System.out.println(isNumber(s));
    }

    public static boolean isNumber(String s) {

        int n = s.length();
        int index = 0;

        //0整数，1小数，2科学计数法
        int status = 0;
        if(s.charAt(0) == '+'){
            index++;
        }else if(s.charAt(0) == '-'){

            index++;
        }else{
            if(!isNum(s.charAt(0))){
                return false;
            }
        }

        while(index<s.length()){
            char c = s.charAt(index);
            if(isNum(c)){
                index++;
                continue;
            }
            if(c == 'e' || c=='E'){
                if(status == 0){
                    status = 2;
                }else{
                    return false;
                }
            }else if(c == '.'){
                if(status == 0){
                    status = 1;
                }else{
                    return false;
                }
            }else{
                return false;
            }
            index++;
        }
        return true;

    }

    public static boolean isNum(char c){
        return c >= '0' && c <='9';
    }
}
