class Solution {
    public int sum(int n,int[] nums){
        int sum=0;
        for(int i =0;i<=n;i++){
            sum+=nums[i];
        }   
        return sum;
    }
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            runningSum[i] = sum(i,nums); 
        }
        return runningSum;
    }
}