class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int minVal = Integer.MAX_VALUE;
        int count=0;
        long sum=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int absVal= Math.abs(matrix[i][j]);
                sum +=absVal;
      minVal=Math.min(minVal,absVal);
      if(matrix[i][j]<0){
        count++;
      }
            }
            }
            if(count%2==0){
                return (long)sum;
            }else{
                return (long)sum-2*minVal;
            }
        
    }
}

