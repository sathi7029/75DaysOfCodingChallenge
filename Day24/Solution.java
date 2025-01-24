class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;
        for (int[] row : grid) {
            StringBuilder rowKey = new StringBuilder();
            for (int num : row) {
                rowKey.append(num).append(",");
            }
            rowMap.put(rowKey.toString(), rowMap.getOrDefault(rowKey.toString(), 0) + 1);
        }
        for (int col = 0; col < n; col++) {
            StringBuilder colKey = new StringBuilder();
            for (int row = 0; row < n; row++) {
                colKey.append(grid[row][col]).append(",");
            }
            count += rowMap.getOrDefault(colKey.toString(), 0);
        }

        return count;
    }
}