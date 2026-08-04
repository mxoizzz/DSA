class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int count = (max - min) + 1 - nums.length;
        if (count == 0) {
            return res;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}