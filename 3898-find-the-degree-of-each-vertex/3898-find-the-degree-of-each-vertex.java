class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix[0].length];
        Arrays.fill(ans,0);
        for(int i=0;i<matrix[0].length;i++){
            for(int j =0;j<matrix.length;j++){
                if(matrix[i][j] == 1){
                    ans[i]++;
                }
            }
        }

        return ans;
    }
}