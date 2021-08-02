package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yexiangyu
 * @description 数值的整数次方
 * @apiNote
 */
public class Jz12 {
    public static void main(String[] args) {
        System.out.println(Power(2.000000,-3));
    }
    public static double Power(double base, int exponent) {
        double  res = 1;
        if(exponent < 0){
            exponent = -exponent;
            base = 1/base;
        }
        while(exponent > 0){
            if((exponent&1) ==1){
                res *= base;
            }
            base *= base;
            exponent >>= 1;
        }

        return res;
    }
}
