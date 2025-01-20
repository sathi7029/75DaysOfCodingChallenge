class Solution {
    public int pivotIndex(int[] nums) {
                int totalSum = 0; // Total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0; // Initialize left sum as 0
        for (int i = 0; i < nums.length; i++) {
            // Check if left sum equals right sum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Pivot index found
            }
            leftSum += nums[i]; // Update left sum for the next iteration
        }
        
        return -1; // No pivot index found

    }
}