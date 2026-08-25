class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int temp = k;
        while(true) {
            if(!set.contains(temp)){
                return temp;
            }
            temp+=k;
        }

    }
}