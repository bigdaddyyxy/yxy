package leetcode;

import java.util.Arrays;

/**
 * @author yexiangyu
 * @description  长度最小的子数组
 * @apiNote
 */
public class lc209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
        int res = minSubArrayLen(target,nums);
        System.out.println(res);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = n+1;
        int sum = 0;

        int right = -1;
        for(int i=0;i<n;i++){
            if(i != 0){
                sum -= nums[i-1];
            }

            while(right+1<n && sum<target){
                right++;
                sum += nums[right];
            }

            if(sum>=target){
                res = Math.min(res, right-i+1);
            }

        }
        return res ==n+1 ? 0:res;
    }
}
