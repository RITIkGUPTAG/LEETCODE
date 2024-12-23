class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff= Integer.MAX_VALUE;
        int closet=0;
            Arrays.sort(nums);
      
        for(int i=0; i<nums.length; i++){
            int j=i+1,k=nums.length-1;
              while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==target) return sum;
            if(Math.abs(sum-target)<diff){
                diff=Math.abs(sum-target);
                closet=sum;
            }
        
            else if(sum<target){
             j++;   
            
        }
            else{
                k--;
            }
        }
    }
        return closet;
    }
}