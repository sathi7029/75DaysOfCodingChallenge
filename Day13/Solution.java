class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Initialize the left pointer
        int right = height.length - 1; // Initialize the right pointer
        int maxArea = 0; // Variable to store the maximum area
        
        // Loop until the pointers meet
        while (left < right) {
            // Calculate the area
            int width = right - left;
            int currentArea = width * Math.min(height[left], height[right]);
            
            // Update the maximum area
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer pointing to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea; // Return the maximum area
    }
}
