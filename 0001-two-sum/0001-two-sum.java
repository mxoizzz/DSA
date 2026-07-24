class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elements = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            int needed = target-curr;
            if(elements.containsKey(needed)){
                return new int[] {i,elements.get(needed)};
            }
            elements.put(nums[i],i);
        }
        return new int[2];
    }
}