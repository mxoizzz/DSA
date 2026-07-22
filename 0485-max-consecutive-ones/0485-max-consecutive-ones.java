class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int n : nums){
            if(n!=0){
                count++;
                if(max<count){
                    max = count;
                }
                continue;
            }
            count = 0;
        }
        return max;
    }
}