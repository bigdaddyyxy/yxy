package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author yexiangyu
 * @description 零钱兑换
 * @apiNote
 */
public class lc322 {
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));

    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for(int coin : coins){
            for(int i=0;i<dp.length;i++){
                if(i>=coin){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount ? -1 : dp[amount];

    }
}
