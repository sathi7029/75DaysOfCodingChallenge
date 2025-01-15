class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum=0, maxSum=0;

        int start=0,end=0;

           
        while(end<k){
            windowSum+=nums[end++];
        }

        maxSum=windowSum;

        while(end<nums.length){
            windowSum+=nums[end++]-nums[start++];
            maxSum=Math.max(maxSum,windowSum);

        }

        return maxSum/k;
    }
}