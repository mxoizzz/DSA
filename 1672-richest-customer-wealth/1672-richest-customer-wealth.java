class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum =0;
        int max = 0;
        for(int[] i: accounts){
            for(int j: i){
                sum+=j;
            }
            if(sum>max){max = sum;}
            sum = 0;
        }
        return max;
    }
}