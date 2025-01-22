class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> frequencySet = new HashSet<>(frequencyMap.values());
        return frequencySet.size() == frequencyMap.size();
    }
}