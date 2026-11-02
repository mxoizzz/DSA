class Solution {
    public int[] applyOperations(int[] nums) {
        int left = 0,
                right = 1;
        while (left < nums.length && right < nums.length) {
            if (nums[left] == nums[right]) {
                nums[left] *= 2;
                nums[right] = 0;
                left += 2;
                right += 2;
            } else {
                left++;
                right++;
            }
        }
        left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }

}