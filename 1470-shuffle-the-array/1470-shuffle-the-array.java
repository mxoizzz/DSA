class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int i = 0,
            j = n;
        int k = 0;
        while(i<n && j<nums.length){
            res[k] = nums[i];
            k++;
            res[k] = nums[j];
            k++;
            i++;j++;
        }
        return res;
    }
}