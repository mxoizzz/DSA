class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int left = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
            i++;
        }
    }
}