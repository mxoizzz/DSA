class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int total = n*m;
        k = k % total;

        List<List<Integer>> resGrid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(0);
            }
            resGrid.add(row);
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int idx = i * m + j;

                int newIdx = (idx + k) % total;

                int newI = newIdx / m;
                int newJ = newIdx % m;

                resGrid.get(newI).set(newJ, grid[i][j]);
            }
        }
        return resGrid;
    }
}