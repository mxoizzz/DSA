class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for (int n : nums1) {
            seen.add(n);
        }

        for (int n : nums2) {
            if(seen.contains(n)) {
                res.add(n);
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for (int n : res) {
            ans[i++] = n;
        }

        return ans;
        // Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        // return Arrays.stream(nums2).filter(set1::contains).distinct().toArray();
    }
}