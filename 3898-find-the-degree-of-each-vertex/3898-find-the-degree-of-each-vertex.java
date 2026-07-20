class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j =0;j<matrix.length;j++){
                ans[j] += matrix[i][j];
            }
        }

        return ans;
    }
}