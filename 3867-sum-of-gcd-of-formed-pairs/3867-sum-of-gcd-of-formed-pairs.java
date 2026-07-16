class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
    }
    public long gcdSum(int[] nums) {
        int[] mx = new int[nums.length];
        mx[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            mx[i] = Math.max(mx[i-1],nums[i]);
        }
        int[] prefixGcd = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            prefixGcd[i] = gcd(nums[i],mx[i]);
        } 
        Arrays.sort(prefixGcd);
        int i = 0,j = nums.length-1;
        long sum = 0;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}