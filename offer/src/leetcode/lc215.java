package leetcode;

/**
 * @author yexiangyu
 * @description topK 题目
 * @apiNote
 */
public class lc215 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int target = nums.length-k;
        find(nums,target,0,nums.length-1);
        return nums[target];
    }

    public static void find(int[] nums, int target, int low, int high){
        int p = part(nums, low, high);
        if(p < target){
            find(nums,target,p+1,high);
        }else if(p > target){
            find(nums,target,low,p-1);
        }
        return;
    }


    public static int part(int[] nums, int low, int high){
        int divide = nums[low];
        while(low<high){
            while(low<high && nums[high]>=divide){
                high--;
            }
            nums[low] = nums[high];
            while(low<high && nums[low]<divide){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = divide;
        return low;
    }
}
