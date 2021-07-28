package leetcode;

/**
 * @author yexiangyu
 * @description 删除有序数组中的重复项II
 * @apiNote
 */
public class lc80 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int n = removeDuplicates(nums);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2;
        int fast = 2;
        while(fast<n){
            if(nums[slow-2] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
