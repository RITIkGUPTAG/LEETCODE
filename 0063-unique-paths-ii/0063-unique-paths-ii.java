class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Create a 1D dp array for space optimization
        int[] dp = new int[n];

      if (obstacleGrid[0][0] == 1) {
    dp[0] = 0; // If the starting cell has an obstacle, no paths exist
} else {
    dp[0] = 1; // Otherwise, there's one way to start
}


        // Iterate over the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0; // If there's an obstacle, no path to this cell
                } else if (j > 0) {
                    dp[j] += dp[j - 1]; // Add paths from the left
                }
            }
        }

        return dp[n - 1]; // The result is in the last cell
    }
}
