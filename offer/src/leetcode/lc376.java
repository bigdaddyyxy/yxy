package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

/**
 * @author yexiangyu
 * @description 摆动序列
 * @apiNote
 */
public class lc376 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        System.out.println(wiggleMaxLength(nums));
    }

    public static int wiggleMaxLength(int[] nums) {
        int down = 1;
        int up = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                up = down+1;
            }
            if(nums[i] < nums[i-1]){
                down = up+1;
            }
        }

        return Math.max(up,down);

    }
}
