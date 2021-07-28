package leetcode;

/**
 * @author yexiangyu
 * @description 滑动窗口最大值
 * @apiNote
 */
public class lc239 {
    public static void main(String[] args) {
        int[] nums = new int[]{7,2,4};
        int k = 2;
        int[] res = maxSlidingWindow(nums, k);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        if(k==1) {
            return nums;
        }
        int[] res = new int[n-k+1];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            if(i!=0 && max != nums[i-1]){
                max = Math.max(max, nums[i+k-1]);
                res[i] = max;
            }else{
                max = Integer.MIN_VALUE;
                for(int j=0;j<k;j++){
                    if(nums[i+j]>max){
                        max = nums[i+j];
                    }
                }
                res[i] = max;
            }

        }
        return res;
    }
}
