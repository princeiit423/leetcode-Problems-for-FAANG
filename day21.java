
//leetcode problem number - (62) -------------- unique path
import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        final int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return fun(m - 1, n - 1, dp);
    }

    private int fun(final int m, final int n, final int[][] dp) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = fun(m - 1, n, dp) + fun(m, n - 1, dp);
        return dp[m][n];
    }
}