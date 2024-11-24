class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int minVal = Integer.MAX_VALUE; // Smallest absolute value in the matrix
        int negativeCount = 0; // Count of negative numbers
        long totalSum = 0; // Total sum of absolute values

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int absValue = Math.abs(matrix[i][j]);
                totalSum += absValue;
                minVal = Math.min(minVal, absValue); // Track the smallest absolute value
                if (matrix[i][j] < 0) {
                    negativeCount++; // Count negative numbers
                }
            }
        }

        // If there are an even number of negatives, all can be flipped to positives
        if (negativeCount % 2 == 0) {
            return totalSum;
        } else {
            // If odd, subtract twice the smallest absolute value to maximize sum
            return totalSum - 2L * minVal;
        }
    }
}
