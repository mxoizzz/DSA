class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        int j = 2;
        int n = nums.length;
        if(n<=2){
            return n;
        }
        while(i<n){
            if(nums[i]!=nums[j-2]){
                nums[j] = nums[i];
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return j;
    }
}