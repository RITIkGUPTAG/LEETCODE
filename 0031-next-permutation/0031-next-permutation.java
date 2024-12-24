import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return; 
        }

        int idx1 = -1;
        // Step 1: Find the first decreasing element from the end
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the entire array
        if (idx1 == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find the element just larger than nums[idx1] to the right
        int idx2 = -1;
        for (int i = nums.length - 1; i > idx1; i--) {
            if (nums[i] > nums[idx1]) {
                idx2 = i;
                break;
            }
        }

        // Step 4: Swap the elements at idx1 and idx2
        swap(nums, idx1, idx2);

        // Step 5: Reverse the elements to the right of idx1
        reverse(nums, idx1 + 1, nums.length - 1);
    }

    // Helper method to reverse a subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
