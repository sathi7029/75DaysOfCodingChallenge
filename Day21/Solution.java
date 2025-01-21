class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use HashSet to store unique elements from both arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements from nums1 and nums2 to their respective sets
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Create result lists for unique elements
        List<Integer> uniqueInNums1 = new ArrayList<>();
        List<Integer> uniqueInNums2 = new ArrayList<>();
        
        // Find elements unique to nums1
        for (int num : set1) {
            if (!set2.contains(num)) {
                uniqueInNums1.add(num);
            }
        }
        
        // Find elements unique to nums2
        for (int num : set2) {
            if (!set1.contains(num)) {
                uniqueInNums2.add(num);
            }
        }
        
        // Create the final answer list
        List<List<Integer>> result = new ArrayList<>();
        result.add(uniqueInNums1);
        result.add(uniqueInNums2);
        
        return result;
    }
}