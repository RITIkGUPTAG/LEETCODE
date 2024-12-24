class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int h=0; h<nums.length-3;h++){
             if(h>0 && nums[h]==nums[h-1]){
                continue;
            }
        for(int i=h+1; i<nums.length-2; i++){
            if(i>h+1 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
           
            long sum=(long)nums[h]+nums[i]+nums[j]+nums[k];
                
            if(sum==target){
                 List<Integer> list=new ArrayList<>();
                list.add(nums[h]);
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                 result.add(list);
                j++;
                k--;
               while(j<k&& nums[j]==nums[j-1]){
                   j++;
               }
                 while(j<k&& nums[k]==nums[k+1]){
                   k--;
               }
            }
                else if(sum<target){
                    j++;
                }
                else {
                    k--;
                }
                
            }   
        }
    }
        return result;
    }
}