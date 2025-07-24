class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[100];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i] ){
                max=arr[i];
            }
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(max==arr[i]){
                sum +=arr[i];
            }
        }
        return sum;
    }
}