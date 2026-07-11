class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for(int i : gain){
            sum += i;
            if(sum>max){max = sum;}
            // sum = i;
        }
        return max;
    }
}