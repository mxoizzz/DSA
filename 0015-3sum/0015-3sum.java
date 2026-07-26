class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    res.add(triplet);
                    left++;
                    right--;
                    while(left<n && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;

        //Brute Force (311/316 passed)

        // Set<List<Integer>> triplets = new HashSet<>();
        // for(int i =0;i<nums.length;i++){
        //     for(int j =i+1;j<nums.length;j++){
        //         for(int k =j+1;k<nums.length;k++){
        //             if((i!=j && i!=k && k!=j) && nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> row = new ArrayList<>();
        //                 row.add(nums[i]);
        //                 row.add(nums[j]);
        //                 row.add(nums[k]);
        //                 Collections.sort(row);
        //                 triplets.add(row);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> res = new ArrayList<>();
        // for(List<Integer> lst : triplets){
        //     res.add(lst);
        // }
        // return res;
    }
}