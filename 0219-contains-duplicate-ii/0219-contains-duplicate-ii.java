import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store the element and its index
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // Check if the difference of indices is less than or equal to k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the index of the current element
            map.put(nums[i], i);
        }
        return false;
    }
}
