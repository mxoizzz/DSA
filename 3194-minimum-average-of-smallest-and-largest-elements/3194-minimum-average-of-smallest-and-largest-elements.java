class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        double minAverage = Double.MAX_VALUE;
        while(i<j) {
            double currentAverage = (double) (nums[i] + nums[j]) / 2;
            if(currentAverage < minAverage) {
                minAverage = currentAverage;
            }
            i++;j--;
        }
        return minAverage;
    }
}