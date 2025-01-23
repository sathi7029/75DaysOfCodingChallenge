class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        if (!freqMap1.keySet().equals(freqMap2.keySet())) {
            return false;
        }
        List<Integer> freqList1 = new ArrayList<>(freqMap1.values());
        List<Integer> freqList2 = new ArrayList<>(freqMap2.values());

        Collections.sort(freqList1);
        Collections.sort(freqList2);

        return freqList1.equals(freqList2);

    }
}