class Solution {
    private int sum(int[] nums){
        int res = 0;
        for(int n:nums){
            res+=n;
        }
        return res;
    }
    public int minOperations(int[] nums, int k) {
        return sum(nums) % k;
    }
}