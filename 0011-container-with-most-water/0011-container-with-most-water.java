class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int l=0;
         int r=height.length-1;
        while(l<r){
            int lh=height[l];
            int rh=height[r];
            res=Math.max(res,Math.min(lh,rh)*(r-l));
            if(lh<rh){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}