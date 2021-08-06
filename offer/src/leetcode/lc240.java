package leetcode;

/**
 * @author yexiangyu
 * @description 搜索二维矩阵II
 * @apiNote
 */
public class lc240 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{-1,3}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j = 0;
        int num = matrix[i][j];
        while(i>=0 && j<n){
            num = matrix[i][j];
            if(num==target){
                return true;
            }
            if(num < target){
                j++;
            }
            if(num>target){
                i--;
            }

        }
        return num == target;

    }
}
