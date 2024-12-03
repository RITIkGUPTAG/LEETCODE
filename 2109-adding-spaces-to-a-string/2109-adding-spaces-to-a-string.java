import java.util.*;

class Solution {
    public String addSpaces(String s, int[] nums) {
        StringBuilder b = new StringBuilder();
        int j = 0; // Use this to track the index in nums
        
        for (int i = 0; i < s.length(); i++) {
            // Check if the current index matches the next index in nums
            if (j < nums.length && i == nums[j]) {
                b.append(" "); // Insert space
                j++;           // Move to the next index in nums
            }
            b.append(s.charAt(i)); // Append the character from the string
        }
        
        return b.toString();
    }
}
