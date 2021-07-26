package Test03;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 0;
        for (int i =0; i < A.length-1; i++)
        {
            int cur = i;
            int r = cur + 1;
            int vec = A[r] - A[i];
            int dp = 0;

            while ( r< A.length && A[r]-A[r-1] == vec  ){
                if(r - cur >= 2){
                    dp++;
                    res += dp;
                    i = r-1;
                }
                r++;
            }
        }
        return res;


    }
}
