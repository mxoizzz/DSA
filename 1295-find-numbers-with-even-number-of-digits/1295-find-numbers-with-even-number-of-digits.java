class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
        int dc = 0;
            while(n>0){
                int d = n%10;
                dc++;
                n /= 10;
            }
            if(dc%2 == 0){
                count++;
            }
        }
        return count;
    }
}