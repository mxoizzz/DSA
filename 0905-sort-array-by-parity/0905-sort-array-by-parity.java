class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        int low = 0,
            mid = 0,
            high = nums.length-1;
        while(mid<high) {
            if(nums[mid] % 2 == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
}