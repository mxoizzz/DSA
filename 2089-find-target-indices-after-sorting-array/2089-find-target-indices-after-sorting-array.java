class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int smallerCount = 0;
        int targetCount = 0;
        for (int num : nums) {
            if (num < target) {
                smallerCount++;
            } else if (num == target) {
                targetCount++;
            }
        }
        for (int i = 0; i < targetCount; i++) {
            res.add(smallerCount + i);
        }
        
        return res;
    }
}
