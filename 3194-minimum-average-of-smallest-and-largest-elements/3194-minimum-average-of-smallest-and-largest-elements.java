class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        ArrayList<Double> averages = new ArrayList<>();
        while(i<j){
            averages.add((double)(nums[i] + nums[j])/2);
            i++;
            j--;
        }
        return Collections.min(averages);
    }
}