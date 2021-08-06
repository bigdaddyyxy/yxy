package leetcode;

import java.util.Arrays;

/**
 * @author yexiangyu
 * @description 有效的三角形个数
 * @apiNote
 */
public class lc611 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,4};
        System.out.println(triangleNumber(nums));
    }

    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;

        for(int i=0;i<=nums.length;i++){
            int k = i;
            for(int j=i+1;j<nums.length;j++){
                while(k<nums.length-1 && nums[k+1]< nums[i]+nums[j]){
                    k++;
                }
                res += Math.max(k-j,0);
            }
        }
        return res;

    }
}
