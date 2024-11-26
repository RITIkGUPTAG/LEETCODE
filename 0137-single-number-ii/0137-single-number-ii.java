import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        // Create a HashMap to store number frequencies
        Map<Integer, Integer> map = new HashMap<>();
        
        // Populate the map with counts of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with frequency 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1; // Return -1 if no single number found (though problem guarantees one exists)
    }
}
